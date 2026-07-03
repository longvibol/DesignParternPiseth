package com.piseth.solid;

import com.piseth.solid.common.EmailService;
import com.piseth.solid.common.InMemoryUserRepository;
import com.piseth.solid.common.ReportService;
import com.piseth.solid.common.UserRegisterRequest;
import com.piseth.solid.s_srp.good.NewUserReportGenerator;
import com.piseth.solid.s_srp.good.UserMapper;
import com.piseth.solid.s_srp.good.UserRegisterValidator;
import com.piseth.solid.s_srp.good.UserService;
import com.piseth.solid.s_srp.good.UserWriter;
import com.piseth.solid.s_srp.good.WelcomeEmailSender;

public class Main {

    public static void main(String[] args) {
    	
        UserService userService = new UserService(
                new UserRegisterValidator(),
                new UserMapper(),
                new UserWriter(new InMemoryUserRepository()),
                new WelcomeEmailSender(new EmailService()),
                new NewUserReportGenerator(new ReportService())
        );

        userService.register(new UserRegisterRequest("Piseth", "piseth@example.com"));
/*
    	//OCP Called     	   
        DiscountCalculator calculator = new DiscountCalculator(List.of(
        		new GoldDiscountPolicy(),
        		new SilverDiscountPolicy(),
        		new DiamondDiscountPolicy()
        		));
        
        BigDecimal discountAmount = calculator.calculate("DIAMOND",BigDecimal.valueOf(100));   
        System.out.println("Afster discount: " + discountAmount);
*/
    }  

}