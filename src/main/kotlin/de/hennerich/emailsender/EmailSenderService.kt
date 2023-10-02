package de.hennerich.emailsender

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.javamail.JavaMailSender
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

        println("Emailsend successfully....")
    }
}
