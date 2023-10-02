package de.hennerich.emailsender.email

import de.hennerich.emailsender.hideproperties.Properties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl

@Configuration
class EmailConfig {

    @Bean
    fun javaMailSender(): JavaMailSender {
        val mailSender = JavaMailSenderImpl()
        val properties = Properties()
        mailSender.host = "smtp.gmail.com"
        mailSender.port = 587 // SMTP-Port
        mailSender.username = properties.USERNAME
        mailSender.password = properties.PASSWORD

        val props = mailSender.javaMailProperties
        props["mail.transport.protocol"] = "smtp"
        props["mail.smtp.auth"] = "true"
        props["mail.smtp.starttls.enable"] = "true"
        props["mail.debug"] = "true"

        return mailSender
    }
}
