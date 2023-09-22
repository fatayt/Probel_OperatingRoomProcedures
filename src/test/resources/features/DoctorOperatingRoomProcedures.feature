@DoctorOperatingRoomProcedures
@Regression

Feature: Doctor Operating Room Procedures

  Background:
    Given The user logs in
    And   The user goes Doctor Operating Room Procedures page

  @TC0037 @Smoke @US_005
  Scenario: Surgery can be added to the patient coming from the service
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add surgery button
    And   User clicks the select button of the surgery to be performed
    And   User chooses the direction of surgery "SOL"
    And   User selects incision information "3"
    And   User clicks select doctor button "793"
    And   User clicks save button on add surgery screen
    Then  Verifies that the new surgery is added

  @TC0038 @Smoke @US_005
  Scenario: The Surgery can be deleted to the patient coming from the service
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks the trash icon of the operation will be deleted
    And   User clicks yes button on continue popup
    Then  Verifies that the surgery is deleted

  @TC0039  @US_005
  Scenario: Surgeries can be deleted to the patient coming from the service
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks delete surgeries button
    And   User clicks yes button on continue popup
    Then  Verifies that surgeries are deleted

  @TC0040  @US_005
  Scenario: The operation details of the patient coming from the service can be changed or added
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User clicks add diagnosis button
    And   User selects diagnosis
    And   User clicks select and close button
    And   User clicks save button on surgery details screen
    Then  Verifies that new diagnosis is displayed

  @TC0040A  @US_005
  Scenario: User clean the operation's details
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User clean the page

  @TC0041  @US_005
  Scenario: The operation details of the patient coming from the service can be viewed
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User enters details
    And   User clicks save button on surgery details screen
    Then  Verifies that new details are displayed

  @TC0041A  @US_005
  Scenario: User cleans the operation's details
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User cleans the page

  @TC0042 @Smoke @US_005
  Scenario: A surgical team's doctor can be added for the patient coming from the service.
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on surgical team section
    And   User selects the doctor
    And   User clicks select and close button
    Then  Verifies that the doctor is added

  @TC0043 @BUG  @US_005
  Scenario:  On Surgical team The user can delete the selected doctor by the trash icon
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on surgical team section
    And   User selects the new doctor
    And   User clicks select and close button
    And   User clicks on the trash icon in the surgical team section
    And   User clicks yes button on continue popup
    Then  Verifys that the message Goruntulenecek veri yok is not displayed

  @TC0044  @US_005
  Scenario: Anesthesia surgery team cannot be added the same doctor for the patient coming from the service.
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on Anesthesia surgery team section
    And   User selects the anesthesia doctor
    And   User clicks select and close button
    Then  Verifies that the anesthesia doctor is added

  @TC0045  @BUG  @US_005
  Scenario: On Anesthesia surgery team The user can delete the selected doctor
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on the trash icon in the Anesthesia team section
    And   User clicks yes button on continue popup
    Then  Verify that only the selected doctor is deleted

  @TC0046 @Smoke @US_005
  Scenario: In order to start the operation of the patient coming from the service,
  a responsible person from the surgical team and anesthesia surgery team should be selected.
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User selects responsible doctor on surgical team
    And   User clicks the start session
    And   User clicks yes button on continue popup
    Then  Verifies that the warning messeage of You must choose the responsible person

  @TC0047 @Smoke @US_005
  Scenario: When starting the surgery session for an outpatient,
  the warning message "Patient is not currently hospitalized" should be received.
    Given User enters the claim date "22.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks the start session
    Then  Verifies that the warning messeage of Patient is not hospitalized



  @TC0049  @US_006
  Scenario: The patient's status is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's condition is displayed

  @TC0050  @US_006
  Scenario: The patient's saloon is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's saloon is displayed

  @TC0051  @US_006
  Scenario: The patient's service is displayed on the Postop page.
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's service is displayed

  @TC0052  @US_006
  Scenario: With the radio button sent to the service, only the patients sent to the service are displayed
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    And   User clicks the sended service radio Button
    Then  Verifies that the situation

  @TC0053  @US_006
  Scenario: The Postop page can be refreshed with the refresh button.
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    Then  User displays the message of Goruntulenecek veri yok
    And   User clicks refresh button
    And   Verifies that the refresh button is working by viewing the patients

  @TC0054  @US_006
  Scenario: The patient's service code is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's service code is displayed

  @TC0088    @US_005
  Scenario: A surgical team's doctor can be deleted for the patient coming from the service
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button (saloon eight)
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on surgical team section
    And   User selects the doctor
    And   User clicks select and close button
    And   User clicks on the trash icon in the surgical team section
    And   User clicks yes button on continue popup
    And   User clicks refresh button on Doctor Operating Room Procedures page
    Then  Verifys that the surgical team^s doctor is deleted

  @TC0089  @BUG @US_005
  Scenario: A Anesthesia surgery team's doctor can be deleted for the patient coming from the service.
    Given User enters the claim date "24.11.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on the trash icon in the Anesthesia team section
    And   User clicks yes button on continue popup
    And   User clicks refresh button on Doctor Operating Room Procedures page
    Then  Verify that the selected doctor is deleted

  @TC0090 @Smoke @US_006
  Scenario: Patients can be sent to the service from the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "24.11.2023"
    And   User clicks refresh button
    And   User chooses and clicks the patient
    And   User clicks on send patient to service button
    Then  Verifies the patient's condition

  @TC0055 @Smoke @US_006
  Scenario: Emergency patients can be added to the list according to their
  protocol number with the add patient button on the doctor's operating room page.
    Given User enters the claim date "26.09.2023"
    And   User clicks the add patient button to the list on doctor page
    And   User enters the protocol No
    And   User clicks the query button
    And   User chooses the service
    And   User chooses the saloon
    And   User clicks the add patient button to the list
    And   The user goes Create Surgery List page
    And   User enters the claim date "26.09.2023" on patient List Page
    And   User verifies the patient can be added

   # @TC0056
   #   Scenario:
   #   Given  The user goes Create Surgery List page
   #   And   User enters the claim date "26.09.2023" on patient List Page
   #   And   User clicks the settigs of patient
   #   And   User clicks the take the patient off the table button
   #   And   User clicks yes button on continue popup
   #   And   User clicks add button
   #   And   User click the salon operations button
   #   And   User clicks the cancel saloon button
   #   And   User clicks yes button on continue popup
   #   And   Verify the patient is deleted








