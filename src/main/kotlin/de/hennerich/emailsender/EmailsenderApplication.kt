package de.hennerich.emailsender

import de.hennerich.emailsender.email.EmailSenderService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmailsenderApplication

	fun main(args: Array<String>) {
		runApplication<EmailsenderApplication>(*args)
		val EmailSenderService = EmailSenderService()

		EmailSenderService.sendSimpleEmail(args[0] + "@" + args[1], "Email-Reset", "Hier erhalten sie einen Link zum zurücksetzten ihrer Email")
	}


