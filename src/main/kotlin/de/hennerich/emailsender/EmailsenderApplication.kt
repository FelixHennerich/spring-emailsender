package de.hennerich.emailsender

import de.hennerich.emailsender.email.EmailSenderService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmailsenderApplication


/**
 * @sample java -jar FileName.jar test test.de 12345678
 */

fun main(args: Array<String>) {
		runApplication<EmailsenderApplication>(*args)
		val EmailSenderService = EmailSenderService()
		val ip = "http://85.215.41.146"
		val requestid = args[2]
		EmailSenderService.sendSimpleEmail(
			to = args[0] + "@" + args[1],
			subject = "Email-Reset",
			text = """
				Hey, you just requested a password reset link. Just click on the following link if you have just applied for the link.
				If you have no knowledge of this, you do not need to take any action as this link will become invalid within 24 hours.

				Here is your link: http://$ip/passwordreset.php?resetID=$requestid"""
		)
		//TODO Impletement reset link
	}


