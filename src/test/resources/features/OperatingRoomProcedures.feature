@OperatingRoomProcedures
@Regression

Feature: Operating Room Procedures

  Background:
    Given The user logs in
    And The user goes Operating Room Procedures page

  @TR0025
  Scenario: US_003  The user can confirm the patient's salon.
    And User enters date
    And User clicks the refresh button
    And User selects hall
    And User selects patient
    And User clicks on salon operations
    And User hall approves
    Then User verifies patient


  @TR0026
  Scenario: US_003 User can cancel the patient's salon
    And User enters date
    And User clicks the refresh button
    And User selects hall
    And User selects patient
    And User clicks on salon operations
    And User cancels the salon
    And User clicks the refresh button
    And User verify that the hall has been cancelled


  @TR0027
  Scenario: US_003 The user can approve all halls.
    And User enters date
    And User clicks the refresh button
   # And User selects hall
 #   And User selects patient
    And User clicks on salon operations
    And  User confirms all halls
  #  Then User verifies patient


  @TR0028
  Scenario: US_003 User can cancel all halls
    And User enters date
    And User clicks the refresh button
    And User selects hall
    And User selects patient
    And User clicks on salon operations
    And User cancels all halls
    Then User verifies patient

  @TR0029
  Scenario: US_003 User can change the patient's lounge
    And User enters date
    And User clicks the refresh button
    And User selects hall
    And The user clicks on the patient operations button
    And  User clicks on change hall button
    And User selects new hall
    And User clicks the refresh button
   # And  The user clicks on the hall  has selected
  # And Confirms that the user left has changed

  @TR0030
  Scenario: US_003 User enters patient's surgery details
    And User enters date
    And User clicks the refresh button
    And User selects hall
    And User selects patient
    And User clicks on the surgery details button
    And User selects Diagnosis
    And User writes diagnosis
    And User writes description
    And User writes a hospitalization note
    And User clicks the Save button on the Surgery details page
 # And User clicks the Close button on the surgery details page



  @TR0031  @Smoke
  Scenario: US_003 User makes the patient's patient's entrance to the operating room
    And User enters date
    And User clicks the refresh button
    And user finds patient with protocol number
    And User selects patient
    And User clicks on salon operations
    And User hall approves
    And User selects patient
    And User clicks on the button Patient entered the operating room


  @TR0032
  Scenario: US_003 User cancels the patient's entry to the operating room
    And User enters date
    And User clicks the refresh button
    And user finds patient with protocol number
    And User selects patient
    And User cancels the patient's entrance to the operating room of the patient


  @TR0033  @Smoke
  Scenario: US_004 User can add patients to the list on the operating room operations page.
    And User enters date
    And User clicks the refresh button
    And User clicks on Add patient to list button
    And The user enters the protocol number of the patient they want to add
    And User clicks on the questioning button
    And User clicks on the poup1 salon button
    And User popup2 selects hall
    And User clicks popup1 on Add patient to list button
 #And The user clicks on the hall of their choice
# And User verifies that the patient has been added to the list

  @TR0036   @Smoke
  Scenario: US_004 User can send the patient to the ward
    And User enters date
    And User clicks the refresh button
    And User clicks the home page Postop button
    And User enter data POstop page
    And User click the refresh button POstop page
    And The user selects the patient they want to send to the service
    And User clicks on Send patient to ward button
    #And user finds patient with protocol number
  #  And User selects patient
 # And  User verifies that the patient has been sent to the service




  @TR0034 @Bug
  Scenario: US_004 User can add patients to the list on the Operating Room Procedures page and chooses the necessary doctor.
    And User enters date
    And User clicks the refresh button
    And The user enters the protocol number of the patient they want to add1
    And The user clicks on the patient operations button
    And User clicks the exit from the table button
    And User clicks on Add patient to list button
    And  The user enters the protocol number2 of the patient they want to add
    And User clicks on the query button
    And User clicks the service button
    And User selects the EMERGENCY CHILD DAY CARE Service
    And the user selects the salon popup add list page
  #  And The user enters the protocol number of the patient they want to add1
    And User verifies that the patient has been added to the list


  @TR0035   @Bug
  Scenario: US_004 User can add patients to the list on the operating room operations page and chooses an obstetrician
    And User enters date
    And User clicks the refresh button
   # And The user enters the protocol number of the patient they want to add1
    And User selects hall
    And The user clicks on the patient operations button
    And User clicks the exit from the table button
    And User clicks on Add patient to list button
    And  The user enters the protocol number2 of the patient they want to add
    And User clicks on the query button
    And User clicks the service button
    And User selects the GUNUBIRLIK KADIN HAST.VE DOGUM SERVISI Service
    And the user selects the salon popup add list page
   # And The user enters the protocol number of the patient they want to add1
    And User verifies GUNUBIRLIK KADIN HAST.VE DOGUM SERVISI that the patient has been added to the list