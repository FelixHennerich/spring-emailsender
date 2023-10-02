package de.hennerich.emailsender.email

import de.hennerich.emailsender.email.EmailConfig
import org.springframework.mail.SimpleMailMessage
import org.springframework.stereotype.Service

@Service
class EmailSenderService {


    fun sendSimpleEmail(to: String, subject: String, text: String) {
        val emailConfig = EmailConfig()
        val emailSender = emailConfig.javaMailSender()
        val message = SimpleMailMessage()
        message.setTo(to)
        message.setSubject(subject)
        message.setText(text)

        emailSender.send(message)

        println("Email send successfully....")
    }
}
