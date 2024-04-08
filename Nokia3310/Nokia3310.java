import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Nokia3310 {

	public static void main(String... args) {

		String prompts = """
				\nWelcome To your Nokia phone.
				List of menu functions.
				1 -> Phone
				2 -> Messages
				3 -> Clock
				4 -> Reminders
				5 -> Tones
				6 -> Settings
				7 -> Calculator
				8 -> Games
				9 -> Profiles
				10 -> Sim services
				""";
		System.out.print(prompts);

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter an option: ");
		int keypadInput = input.nextInt();

		switch (keypadInput) {
			default -> System.out.println("Invalid input\nPlease follow the prompt");
			case 1 -> {

				String promptsForPhone = """
						\nPhone menu
						1 -> Phone book
						2 -> Service Nos.
						3 -> Add name
						4 -> Erase
						5 -> Edit
						6 -> Assign tone
						7 -> Send b' card
						8 -> Options
						9 -> Speed dials
						10 -> Voice tags
						11 -> Show call duration
						12 -> Show call costs
						13 -> Call cost settings
						14 -> Prepaid credit
						15 -> Back
						\n
						""";

				System.out.print(promptsForPhone);

				Scanner menuListForPhone = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int optionsForPhone = menuListForPhone.nextInt();

				switch (optionsForPhone) {
					default -> System.out.println("Invalid input\nPlease follow the prompt");
					case 1 -> {
						String phoneBookPrompt = """
								\nPhone book
								1 -> Call register
								2 -> Call logs
								3 -> Call settings
								4 -> Back
								""";
								System.out.println(phoneBookPrompt);
								

								Scanner entryForPhoneBook = new Scanner(System.in);
								System.out.println("Enter an option: ");
								int inputForPhoneBook = entryForPhoneBook.nextInt();

								switch (inputForPhoneBook) {
									case 1 ->  {
										String contactList = """
												\nContact list
												1 -> Amaka
												2 -> Mr. Chibuzo
												3 -> Miss Jenny
												4 -> Kents big head
												5 -> Back
												""";

												System.out.println(contactList);

												Scanner callingContact = new Scanner (System.in);
												System.out.println("Enter an option to call contact: ");
												int inputForCallingContact = callingContact.nextInt();

												switch (inputForCallingContact) {
													case 1 -> System.out.println("Calling Amaka...");
													case 2 -> System.out.println("Calling Mr. Chibuzo...");
													case 3 -> System.out.println("Calling Miss Jenny...");
													case 4 -> System.out.println("Calling Kents big head...");
													case 5 -> System.out.println(prompts);
												}
									}

									case 2 ->  {
										String callLogs = """
												\nCall Logs
												1 -> Missed calls
												2 -> Received calls
												3 -> Dialed numbers
												4 -> Erase recent call list
												5 -> Back
												""";
												System.out.println(callLogs);

												Scanner promptsForcallLogs = new Scanner(System.in);
												System.out.println("Select the menu: ");
												int inputForCallLogs = promptsForcallLogs.nextInt();

												switch (inputForCallLogs) {
													case 1 -> {
														String promptsForMissedCalls = """
															\nMissed calls
															1 -> Mr. Chibuzo (5)
															2 -> Amaka (23)
															3 -> Back
																""";
																System.out.println(promptsForMissedCalls);

																Scanner promptsForViewingMissedCalls = new Scanner(System.in);
																System.out.println("Select an option");
																int inputForMissedCalls = promptsForViewingMissedCalls.nextInt();

																switch (inputForMissedCalls) {
																	case 1 -> {
																		String optionsForMissedCalls1 = """
																				\nOptions
																				1 -> Call Mr. Chibuzo back
																				2 -> Back
																				""";

																				System.out.println(optionsForMissedCalls1);

																				Scanner opsForMissedCalls1 = new Scanner(System.in);
																				System.out.println("Enter an option: ");
																				int inputOpsForMissedCalls1 = opsForMissedCalls1.nextInt();

																					switch (inputOpsForMissedCalls1) {
																						case 1 -> System.out.println("Calling Mr. Chibuzo...");
																						case 2 -> System.out.println(prompts);
																					}

																	}			

																	case 2 -> {
																		String optionsForMissedCalls2 = """
																				\nOptions
																				1 -> Call Amaka back
																				2 -> Back
																				""";

																				System.out.println(optionsForMissedCalls2);

																				Scanner opsForMissedCalls2 = new Scanner(System.in);
																				System.out.println("Enter an option: ");
																				int inputOpsForMissedCalls2 = opsForMissedCalls2.nextInt();

																					switch (inputOpsForMissedCalls2) {
																						case 1 -> System.out.println("Calling Amaka...");
																						case 2 -> System.out.println(prompts);
																					}

																	}	
																}
															}

													case 2 -> System.out.println("Received calls");
													case 3 -> System.out.println("Dailed numbers");
													case 4 -> System.out.println("Erase recent call list");
													case 7 ->  System.out.println(prompts);
												}
									}
									
									
								}
					}

					case 2 -> System.out.print("Service Nos.");
					case 3 -> System.out.print("Add name");
					case 4 -> System.out.print("Erase");
					case 5 -> System.out.print("Edit");
					case 6 -> System.out.print("Assign tone");
					case 7 -> System.out.print("Send b' card");
					case 8 -> {
						String options ="""
								\nOptions
								1 -> Type of view
								2 -> Memory status
								3 -> Back 
								""";

								System.out.println(options);

								Scanner entryForOptions = new Scanner(System.in);
								System.out.println("Enter an option");
								int inputForOptions = entryForOptions.nextInt();

									switch (inputForOptions) {
										case 1-> System.out.println("Type of view");
										case 2 -> System.out.println("Memory status");
										case 3 -> System.out.println(prompts);
									}
					}
					case 9 -> System.out.print("Speed dials");
					case 10 -> System.out.print("Voice tags");

					case 11 -> {
						String menuForCallDuration = """
								\nCall duration
								1 -> Last call duration
								2 -> All calls' duration
								3 -> Received calls' duration
								4 -> Dialed call's duration
								5 -> Clear timers
								6 -> Back
								""";
								System.out.println(menuForCallDuration);

									Scanner entryForCallDuration = new Scanner(System.in);

									System.out.println("Enter an option");
									int inputForCallDuration = entryForCallDuration.nextInt();

									switch (inputForCallDuration) {
										case 1 -> System.out.println("List of call duration\nMr. Chibuzo (03.12.45)\nAmaka (01.03.35)");
										case 2 -> System.out.println("All calls' duration\n5 hours, 57 minutes");
										case 3 -> System.out.println("Nothing to see here ;-)");
										case 4 -> System.out.println("Nothing to see here ;-)");
										case 5 -> System.out.println("Nothing to see here ;-)");
										case 6 -> System.out.println(prompts);
									}
					}
					case 12 -> {
						String promptsForCallCost = """
								\nCall costs
								1 -> Last call cost
								2 -> All calls' cost
								3 -> Clear counters
								4 -> Back
								""";
								System.out.println(promptsForCallCost);

									Scanner entryForCallCosts = new Scanner(System.in);
									System.out.println("Enter an option");
									int inputForCallCosts = entryForCallCosts.nextInt();

									switch (inputForCallCosts) {
										case 1 -> System.out.println("Last call cost\nAs at 23/03/2024 is: NGN1,200");
										case 2 -> System.out.println("All call's cost: NGN1,200");
										case 3 -> System.out.println("Clearing counter...");
										case 4 -> System.out.println(prompts);
									}

					}
					case 13 -> {
						String promptsForCallCostSettings = """
								\nCall cost settings
								1 -> Call cost limit
								2 -> Show costs in
								3 -> Back
								""";
								System.out.println(promptsForCallCostSettings);

									Scanner entryForCallCostSettings = new Scanner(System.in);

									System.out.println("Enter an option");
									int inputForCallCostSettings = entryForCallCostSettings.nextInt();
					}
					case 14 -> System.out.print("Prepaid credit");
					case 15 -> System.out.print(prompts);


				}

			}

			case 2 -> {

				String promptsForMessages = """
						\nMessages
						1 -> Compose messages
						2 -> Inbox
						3 -> Outbox
						4 -> Picture Messages
						5 -> Templates
						6 -> Write messages
						7 -> Message settings
						8 -> Back
						\n
						""";

				System.out.print(promptsForMessages);

				Scanner promptmenuForMessages = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForMessages = promptmenuForMessages.nextInt();

				switch (inputForMessages) {

					case 1 -> System.out.print("Find contact");
					case 2 -> System.out.print("Inbox");
					case 3 -> System.out.print("Outbox");
					case 4 -> System.out.print("Picture Messages");
					case 5 -> System.out.print("Templates");
					case 6 -> System.out.print("Write messages");

					case 7 -> {
						String promptsForMessageSettings = """
								\nMessage settings
								1 -> Set 1
								2 -> Common
								
								5 -> Back
								""";

								System.out.println(promptsForMessageSettings);

								Scanner menuForMessageSettings = new Scanner(System.in);
								System.out.println("Enter an option number: ");
								int inputForMessageSettings = menuForMessageSettings.nextInt();

								switch (inputForMessageSettings) {
									case 1 -> {
										String promptsForSet = """
												\nSet
												1 -> Message center number
												2 -> Message validity
												3 -> Back
												"""; 

												System.out.println(promptsForSet);

												Scanner entryForSet = new Scanner(System.in);
												System.out.println("Enter an option: ");
												int inputForSet = entryForSet.nextInt();

												switch (inputForSet) {
													case 1 -> System.out.println("Accessing message center number...");
													case 2 -> System.out.println("Accessing message validity...");
													case 3 -> System.out.println(prompts);
												}
												
									}
									case 2 -> {
										String promptsForCommon = """
												\nCommon
												1 -> Delivery reports
												2 -> Reply via same center
												3 -> Character support
												4 -> Back
												"""; 

												System.out.println(promptsForCommon);

												Scanner entryForCommon = new Scanner(System.in);
												System.out.println("Enter an option: ");
												int inputForCommon = entryForCommon.nextInt();

												switch (inputForCommon) {
													case 1 -> System.out.println("Accessing delivery reports...");
													case 2 -> System.out.println("Accessing reply via same center...");
													case 3 -> System.out.println("Accessing character support...");
													case 4 -> System.out.println(prompts);
												}
									}
								}


					} 
					case 8 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

			case 3 -> {

				String promptsForClock = """
						\nClock
						1 -> Alarm clock
						2 -> Clock settings
						3 -> Date settings
						4 -> Stopwatch
						5 -> Countdown timer
						6 -> Auto update of date and time
						7 -> Back
						\n
						""";

				System.out.print(promptsForClock);

				Scanner entryForClockInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForClock = entryForClockInput.nextInt();

				switch (inputForClock) {

					case 1 -> System.out.print("Alarm set for\n4:30am");

					case 2 -> {
						String promptsForClockSettings = """
								\nClock settings
								1 -> 24hours clock
								2 -> 12hours clock
								3 -> Back
								""";

								System.out.println(promptsForClockSettings);

									Scanner entryForClockSettings = new Scanner(System.in);

									System.out.println("Enter an option");
									int inputForClockSettings = entryForClockSettings.nextInt();

										switch (inputForClockSettings) {
											case 1 -> System.out.println("Clock settings changed to 24hours");
											case 2 -> System.out.println("Clock settings changed to 12hours");
											case 3 -> System.out.println(prompts);
										}
					}

					case 3 -> System.out.print("Date settings");
					case 4 -> System.out.print("Stopwatch");
					case 5 -> System.out.print("Countdown timer");
					case 6 -> System.out.print("Auto update of date and time");
					case 7 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}
			case 4 -> {

				String promptsForReminder = """
						\nReminder
						1 -> Set reminder
						2 -> Back
						\n
						""";

				System.out.print(promptsForReminder);

				Scanner entryForReminderInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForReminder = entryForReminderInput.nextInt();

				switch (inputForReminder) {

					case 1 -> System.out.print("Set reminder");
					case 2 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

			case 5 -> {
				String promptsForTones = """
						\nTones
						1 -> Ringing tone
						2 -> Ringing volume
						3 -> Incoming call alert
						4 -> Message alet tone
						5 -> Keypad tones
						6 -> Warning and game tones
						7 -> Vibrating alert
						8 -> Screen alert
						9 -> Screen saver
						10 -> Back
						""";
						 System.out.println(promptsForTones);

						 Scanner entryForTones = new Scanner(System.in);
						 System.out.println("Enter an option: ");
						 int inputForTones = entryForTones.nextInt();

						 switch (inputForTones) {
							case 1 -> System.out.println("Ringing tone");
							case 2 -> System.out.println("Ringing volume");
							case 3 -> System.out.println("Incoming call alert");
							case 4 -> System.out.println("Message alet tone");
							case 5 -> System.out.println("Keypad tones");
							case 6 -> System.out.println("Warning and game tones");
							case 7 -> System.out.println("Vibrating alert");
							case 8 -> System.out.println("Screen alert");
							case 9 -> System.out.println("Screen saver");
							case 10 -> System.out.println(prompts);
							}
			}
			



			case 6 -> {

				String promptsForSettings = """
						\nSettings
						1 -> Call settings
						2 -> Phone settings
						3 -> Security settings
						4 -> Restore factory settings
						5 -> Back
						\n
						""";

				System.out.print(promptsForSettings);

				Scanner entryForSettingsInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForSettings = entryForSettingsInput.nextInt();

				switch (inputForSettings) {

					case 1 -> {
						String promptsForCallSettings = """
								\nCall settings
								1 -> Automatic redial
								2 -> Speed dailing
								3 -> Call waiting options
								4 -> Own number sending
								5 -> Phone line in use
								6 -> Automatic answer
								7 -> Back
								""";

								System.out.println(promptsForCallSettings);

								Scanner inputsForCallSettings = new Scanner(System.in);
								System.out.println("Enter an option number: ");
								int inputsForUserCallSettings = inputsForCallSettings.nextInt();

								switch (inputsForUserCallSettings) {
									case 1 -> System.out.println("Automatic redial");
									case 2 -> System.out.println("Speed dialing");
									case 3 -> System.out.println("Automatic redial");
									case 4 -> System.out.println("Call waiting options");
									case 5 -> System.out.println("Own number sending");
									case 6 -> System.out.println("Phone line in use");
									case 7 -> System.out.println("Automatic answer");
									case 8 -> System.out.println(prompts);
								}
					}
					case 2 ->  {
						String promptsForPhoneSettings = """
								\nPhone settings
								1 -> Language
								2 -> Cell info dispaly
								3 -> Welcome note
								4 -> Network selection
								5 -> Lights
								6 -> Confirm SIM service actions
								7 -> Back
								""";
								System.out.println(promptsForPhoneSettings);

									Scanner entryForPhoneSettings = new Scanner(System.in);

									System.out.println("Enter an option");
									int inputForPhoneSettings = entryForPhoneSettings.nextInt();

										switch (inputForPhoneSettings) {
											case 1 -> {
												String languageOptions = """
														\nSelect language options
														1 -> English
														2 -> Dutch
														3 -> Finish
														4 -> Igbo
														5 -> Yoruba
														6 -> Back
														""";

														System.out.println(languageOptions);

															Scanner entryForlanguageOptions = new Scanner(System.in);

															System.out.println("Enter an option");
															int inputForlanguageOptions = entryForlanguageOptions.nextInt();

																switch (inputForlanguageOptions) {
																	case 1 -> System.out.println("Language successfully changed (English)");
																	case 2 -> System.out.println("Taal succesvol veranderd (Dutch)");
																	case 3 -> System.out.println("Kieli vaihdettu onnistuneesti (Finnish)");
																	case 4 -> System.out.println("Asụsụ ịbụrụ olu ọhụrụ\" (Igbo)");
																	case 5 -> System.out.println("Ọrọ ayẹyẹ naa ti yiyi daju\" (Yoruba)");
																	case 6 -> System.out.println(prompts);

																}
											}

											case 2 -> System.out.println("Cell info display\nNokia 30310\nSoftware Nokia30310 v1.023");
											case 3 -> System.out.println("Welcome note\nWelcome to your Nokia phone");
											case 4 -> System.out.println("Network selection\nYour network provider is Glo");
											case 5 -> {
												String promptsForLights = """
														\nFlash Lights
														1 -> Turn light on
														2 -> Turn light off
														3 -> Back
														""";

														System.out.println(promptsForLights);

															Scanner entryForOptions = new Scanner(System.in);

															System.out.println("Enter an option");
															int inputForOptions = entryForOptions.nextInt();

															switch (inputForOptions) {
																case 1 -> System.out.println("Flashlight on");
																case 2 -> System.out.println("Flashlight off");
																case 3 -> System.out.println(prompts);
															}
											}
											case 6 -> System.out.println("Confirm SIM service actions\nNothing to see here ;-)");
											case 7 -> System.out.println(prompts);
										}


					}

					case 3 -> {
						String menuSecuritySettings = """
								\nSecurity settings
								1 -> PIN code request
								2 -> Call barring service
								3 -> Fixed dailing
								4 -> Closed user group
								5 -> Phone security
								6 -> Change access codes
								7 -> Back
								""";

								System.out.println(menuSecuritySettings);

									Scanner entryForSecuritySettings = new Scanner(System.in);

									System.out.println("Enter an option");
									int inputForSecuritySettings = entryForSecuritySettings.nextInt();

										switch (inputForSecuritySettings) {
											case 1 -> System.out.println("Pin code requested");
											case 2 -> System.out.println("Call barring service");
											case 3 -> System.out.println("Fixed dailing");
											case 4 -> System.out.println("Closed user group");
											case 5 -> System.out.println("Phone security");
											case 6 -> System.out.println("Change access code");
											case 7 -> System.out.println(prompts);
										}
					}
					case 4 -> System.out.println("Factory settings restore");
					case 5 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}	

			case 7-> {

				String promptsForCalculator = """
						\nCalculator
						1 -> Calculator
						2 -> Back
						\n
						""";

				System.out.print(promptsForCalculator);

				Scanner entryForCalculatorInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForCalculator = entryForCalculatorInput.nextInt();

				switch (inputForCalculator) {

					case 1 -> System.out.print("Calculator");
					case 2 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

			case 8-> {

				String promptsForGames = """
						\nGames
						1 -> Snake xenzia
						2 -> Soccer
						3 -> Space invaders
						4 -> Back
						\n
						""";

				System.out.print(promptsForGames);

				Scanner entryForGamesInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForGames = entryForGamesInput.nextInt();

				switch (inputForGames) {

					case 1 -> System.out.print("Snake xenzia");
					case 2 -> System.out.print("Soccer");
					case 3 -> System.out.print("Space invaders");
					case 4 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

			case 9 -> {

				String promptsForProfiles = """
						\nProfiles
						1 -> Create new profile
						2 -> Switch profile
						3 -> Back
						\n
						""";

				System.out.print(promptsForProfiles);

				Scanner entryForProfilesInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForProfiles = entryForProfilesInput.nextInt();

				switch (inputForProfiles) {

					case 1 -> System.out.print("Create new profile");
					case 2 -> System.out.print("Switch profile");
					case 3 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

			

			case 10 -> {

				String promptsForSimServices = """
						\nSim services
						1 -> Accessing sim sercices...
						1 -> Back
						\n
						""";

				System.out.print(promptsForSimServices);

				Scanner entryForSimServicesInput = new Scanner(System.in);
				System.out.print("Enter an option number: \n");
				int inputForSimServices = entryForSimServicesInput.nextInt();

				switch (inputForSimServices) {

					case 1 -> System.out.print("Accessing sim sercices...");
					case 2 -> System.out.println(prompts);

					default -> System.out.println("Invalid input\nPlease follow the prompt");

				}

			}

		}

	}

}
