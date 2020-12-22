Logging Using Java

	Logging is the process of writing log messages during the execution of a program to a central place. 
	This logging allows you to report and persist error and warning messages as well as info messages 
	(e.g., runtime statistics) so that the messages can later be retrieved and analyzed.
	The object which performs the logging in applications is typically just called Logger
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
	
---->How to achieve Logging in java?
	Java contains the Java Logging API. 
	This logging API allows you to configure which message types are written.
	Individual classes can use this logger to write messages to the configured log files.
	The java.util.logging package provides the logging capabilities via the Logger class.
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
---->Level in logging
		The following lists the Log Levels in descending order:
				
				SEVERE (highest)
				WARNING
				INFO
				CONFIG
				FINE
				FINER
				FINEST

				
				
In addition to that you also have the levels OFF and ALL to turn the logging off or to log everything.

For example, the following code sets the logger to the info level, which means all messages with severe, 
warning and info will be logged.

LOGGER.setLevel(Level.INFO);


////////////////////////////////////////////////////////////////////////////////////////////////////////////
