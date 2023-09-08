@DoctorOperatingRoomProcedures

Feature: Doctor Operating Room Procedures

  Background:
    Given The user logs in
    And   The user goes Doctor Operating Room Procedures page

  @TC0037 @Regression @US_005
  Scenario: Surgery can be added to the patient coming from the service
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add surgery button
    And   User clicks the select button of the surgery to be performed
    And   User chooses the direction of surgery "SOL"
    And   User selects incision information "3"
    And   User clicks select doctor button "793"
    And   User clicks save button on add surgery screen
    Then  Verifies that the new surgery is added

  @TC0038 @Regression @US_005
  Scenario: The Surgery can be deleted to the patient coming from the service
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks the trash icon of the operation will be deleted
    And   User clicks yes button on continue popup
    Then  Verifies that the surgery is deleted

  @TC0040 @Regression @US_005
  Scenario: The operation details of the patient coming from the service can be changed or added
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User clicks add diagnosis button
    And   User selects diagnosis
    And   User clicks select and close button
    And   User clicks save button on surgery details screen
    Then  Verifies that new diagnosis is displayed

  @TC0041 @Regression @US_005
  Scenario: The operation details of the patient coming from the service can be viewed
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on surgery name
    And   User clicks detail surgery button
    And   User enters details
    And   User clicks save button on surgery details screen
    Then  Verifies that new details are displayed


  @TC0042 @Regression @US_005
  Scenario: A surgical team can be added for the patient coming from the service.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on surgical team section
    And   User selects the doctor
    And   User clicks select and close button
    Then  Verifies that the doctor is added

  @TC0044 @Regression @US_005      #anestezi tarafında eklenen doktor silinemiyor
  Scenario: Anesthesia surgery team can be added for the patient coming from the service.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on Anesthesia surgery team section
    And   User selects the anesthesia doctor
    And   User clicks select and close button
    Then  Verifies that the anesthesia doctor is added

  @TC0039 @Regression @US_005 #SON OLSA İYİ OLUR
  Scenario: Surgeries can be deleted to the patient coming from the service
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks delete surgeries button
    And   User clicks yes button on continue popup
    Then  Verifies that surgeries are deleted

  @TC0047 @Regression @US_005
  Scenario: When starting the surgery session for an outpatient,
  the warning message "Patient is not currently hospitalized" should be received.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks the start session
    And   User clicks yes button on continue popup
    Then  Verifies that the warning messeage of Patient is not hospitalized

  @TC0046 @Regression @US_005
  Scenario: In order to start the operation of the patient coming from the service,
  a responsible person from the surgical team and anesthesia surgery team should be selected.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User selects responsible doctor on surgical team
    And   User clicks the start session
    And   User clicks yes button on continue popup
    And   User clicks Okey button
    Then  Verifies that the warning messeage of You must choose the responsible person

  @TC0043  @BUG  @US_005
  Scenario: A surgical team's doctor can be deleted for the patient coming from the service by the trash icon
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on the trash icon in the surgical team section
    And   User clicks yes button on continue popup
    Then  Verify that only the selected doctor is deleted

  @TC0045  @BUGDONE  @US_005
  Scenario: A Anesthesia surgery team's doctor can be deleted for the patient coming from the service.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks on the trash icon in the Anesthesia team section
    And   User clicks yes button on continue popup
    Then  Verify that only the selected doctor is deleted


  Scenario: A surgical team can be changed for the patient coming from the service.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks the trash icon for selected doctor
    And   User clicks yes button on continue popup
    And   User clicks add doctor button on surgical team section
    And   User selects the doctor
    And   User clicks select and close button


  Scenario: A Anesthesia surgery team can be changed for the patient coming from the service.
    Given User enters the claim date "16.09.2023"
    And   User clicks select saloon button
    And   User clicks on patient information (name surname)
    And   User clicks add doctor button on surgical team section
    And   User selects the doctor
    And   User clicks select and close button
    Then  Verifies that the doctor is added









  @TC0049 @Regression @US_006
  Scenario: The patient's status is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's condition is displayed

  @TC0050 @Regression @US_006
  Scenario: The patient's saloon is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's saloon is displayed

  @TC0051 @Regression @US_006
  Scenario: The patient's service is displayed on the Postop page.
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's service is displayed

  @TC0054 @Regression @US_006
  Scenario: The patient's service code is displayed on the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    Then  Verifies that the patient's service code is displayed

  @TC0053 @Regression @US_006
  Scenario: The Postop page can be refreshed with the refresh button.
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    Then  User displays the message of "Görüntülenecek veri yok"
    And   User clicks refresh button
    And   Verifies that the refresh button is working by viewing the patients

  @TC0048 @Regression @US_006
  Scenario: Patients can be sent to the service from the Postop page
    Given User clicks Postop
    Given User enters the claim date on Postop "16.09.2023"
    And   User clicks refresh button
    And   User chooses and clicks the patient
    And   User clicks on send patient to service button
    Then  Verifies the patient's condition

  @TC0052 @Regression @US_006
  Scenario: With the radio button sent to the service, only the patients sent to the service are displayed

