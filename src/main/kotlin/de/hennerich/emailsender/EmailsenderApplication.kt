package de.hennerich.emailsender

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener

@SpringBootApplication
class EmailsenderApplication

	fun main(args: Array<String>) {
		runApplication<EmailsenderApplication>(*args)
		val EmailSenderService = EmailSenderService()
		EmailSenderService.sendSimpleEmail("christine.hennerich@yahoo.de", "Test", "Hallo das ist ein toller test....")
	}


