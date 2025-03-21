package com.ms.user.producers;

import com.ms.user.dtos.EmailDto;
import com.ms.user.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserProducers {


    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${broker.queue.email.name}")
    private String routingKey;


    public void publishMessageEmail(UserModel userModel) {
        var emailDto = new EmailDto();
        emailDto.setUserId(userModel.getUserId());
        emailDto.setEmailTo(userModel.getEmail());
        emailDto.setSubject("Cadastro realizado com sucesso!");
        emailDto.setText(userModel.getName() + "Seja bem vindo(a)! \nAgradecemos o seu cadastro!");

        rabbitTemplate.convertAndSend("",routingKey, emailDto);

    }
}
