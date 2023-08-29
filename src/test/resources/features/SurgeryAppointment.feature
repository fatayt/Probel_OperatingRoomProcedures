@SurgeryAppointment

Feature: Surgery Appointment

  Background:
    Given The user logs in
    And The user goes Surgery Appointment page

  @newUnit
  Scenario: User can create new surgery service unit
    When click settings button
    And click unit definitions button
    And click new add button
    And click service button
    And enter "derma" to service name box
    #And click search
    And select the service code 187
    And enter the new daily capacity 5
    And click save button
    Then assert the new surgery service unit 187

  @newUnitNoInfo
  Scenario: User can not create new surgery service unit without information
    When click settings button
    And click unit definitions button
    And click new add button
    And click save button
    Then assert the popup message "Servis kodu boş olamaz."
    And close the warning message
    And click service button
    And enter "derma" to service name box
    #And click search
    And select the service code 120
    And click save button
    Then assert the new surgery service unit
    And click delete button

  @noSameUnit
  Scenario: User can not create same surgery service unit
    When click settings button
    And click unit definitions button
    And click new add button
    And click service button
    And enter "derma" to service name box
    #And click search
    And select the service code 187
    And enter the new daily capacity 5
    And click save button
    Then assert the warning message "Aynı Kayıttan Daha Önce Girilmiş"

  @changeCapacity
  Scenario: User can change the daily surgery capacity of service unit
    When click settings button
    And click unit definitions button
    And enter service code 187 to service code box
    And click edit button
    And delete the daily capacity
    And enter the new daily capacity 2
    And click save button
    Then assert the new capacity number "2"

  @noMinusCapacity
  Scenario: User can not set minus number the daily surgery capacity
    When click settings button
    And click unit definitions button
    And enter service code 187 to service code box
    And click edit button
    And delete the daily capacity
    And enter the new daily capacity -5
    And click save button
    Then assert the new capacity number "-5"

  Scenario: User can not set letters the daily surgery capacity
    When click settings button
    And click unit definitions button
    And click settings button of service code 187
    And delete the daily capacity
    And enter the new daily capacity "adsd"
    And click save button
    Then assert the new capacity number "adsd"

  Scenario: User can not create more appointments than the capacity
    When click service button
    And select the service code 1012
    And click new appointment button
    And click find patient button
    Then assert the page of patient history
    And enter the “k” in the name box
    And click search
    And click on the first patient
    Then assert the patient history
    And click the transfer button
    Then assert the patient at popup page
    And click calendar
    And select the date
    And click first surgery button
    And select the surgery code 620680
    And click hours button
    And select appointment time
    And click save button
    And click new appointment button
    And click find patient button
    Then assert the page of patient history
    And enter the “k” in the name box
    And click search
    And click on the second patient
    Then assert the patient history
    And click the transfer button
    And assert the patient at popup page
    And click calendar
    And select the date
    And click first surgery button
    And select the surgery code 700946
    And click hours button
    And select appointment time
    And click save button
    Then assert appointment warning message "Kayıt yapılamaz! Günlük maximum kayıt sayısı :1"

  Scenario: User can delete the surgery service unit
    When click settings button
    And click unit definitions button
    And select the service code 1012
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button for delete
    Then assert the service was deleted

  Scenario: User can switch the passive the unit
    When click settings button
    And click unit definitions button
    And click settings button of service code 187
    And click passive box
    And click save button
    Then assert the unit is passive

  Scenario: User can switch the active the unit
    When click settings button
    And click unit definitions button
    And click settings button of service code 187
    And click active box
    And click save button
    Then assert the unit is active



  Scenario: User can create new group
    When click settings button
    And click group definitions button
    And click new add button
    And click service button
    And enter "derma" to service name box
    And click search
    And select the service code 1700
    And enter the group name "SALON 20"
    And click save button
    Then assert the new group

  Scenario: User can create new group without no information
    When click settings button
    And click group definitions button
    And click new add button
    And click save button
    Then assert the new group
    And click delete button

  Scenario: User can not create same group
    When click settings button
    And click group definitions button
    And click new add button
    And click service button
    And enter "derma" to service name box
    And click search
    And select the service code 1700
    And enter the group name "SALON 20"
    And click save button
    Then assert the new group can not be created

  Scenario: User can edit the group
    When click settings button
    And click group definitions button
    And click settings button of group code 18
    And delete the group name
    And enter the group name "SALON 30"
    And click save button
    Then assert the new group

  Scenario: User can create the reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason

  Scenario: User can not create the same reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason can not be created

  Scenario: User can edit the reason
    When click settings button
    And click cancellation reason button
    And click settings button of reason "feeling better now"
    And delete the reason of cancellation
    And enter "feeling perfect now" to reason of cancellation box
    And click save button
    Then assert the reason

  Scenario: User can delete the reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And delete the reason "feeling perfect now"
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button for delete
    Then assert the reason was deleted

  Scenario: deneme
    When go to home
    And eat something