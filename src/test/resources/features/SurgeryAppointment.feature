@SurgeryAppointment

Feature: Surgery Appointment

  Background:
    Given The user logs in
    And The user goes Surgery Appointment page

  @Smoke @newUnit @TC0067 @US_009
  Scenario: User can create new surgery service unit
    When click settings button
    And click unit definitions button
    And click new add button
    And enter service code "187" to service code box
    And enter the daily capacity "5"
    And click save button
    Then assert the new surgery service unit "187"

  @Regression @newUnitNoInfo @TC0068 @US_009
  Scenario: User can not create new surgery service unit without information
    When click settings button
    And click unit definitions button
    And click new add button
    And click save button
    Then assert the popup message "Servis kodu boş olamaz."
    And close the warning message
    And enter service code "120" to service code box
    And click save button
    Then assert the new surgery service unit

  @Regression @noSameUnit @TC0069 @US_009
  Scenario: User can not create same surgery service unit
    When click settings button
    And click unit definitions button
    And click new add button
    And enter service code "187" to service code box
    And enter the daily capacity "5"
    And click save button
    Then assert the warning message "Aynı Kayıttan Daha Önce Girilmiş"

  @Bug @changeCapacity @TC0070 @US_009
  Scenario: User can change the daily surgery capacity of service unit
    When click settings button
    And click unit definitions button
    And enter service code "187" to unit code box
    Then change and assert the new capacity number
      | Number |
      | -5     |
      | adsd   |
      | 0      |
      | #,!?*" |
      | 99     |
      | 999    |
      | 9999   |
      | 99999  |
      | 999999 |


  @Smoke @noApptMoreThanCapacity @TC0071 @US_009
  Scenario: User can not create more appointments than the capacity
    And select the service code "132"
    And click new appointment button
    And select the date "11.09.2023"
    And enter the protocol number "15388830"
    And select the surgery code "613180"
    And click hours button
    And select appointment time "09 : 00"
    And click save button
    And click new appointment button
    And select the date "11.09.2023"
    And enter the protocol number "14028483"
    And select the surgery code "612760"
    And click hours button
    And select appointment time "10 : 00"
    And click save button
    Then assert the warning message "Kayıt yapılamaz! Günlük maximum kayıt sayısı :1"


  @Smoke @deleteUnit @TC0072 @US_009
  Scenario: User can delete the surgery service unit
    When click settings button
    And click unit definitions button
    And enter service code "187" to unit code box
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the service was deleted "Görüntülenecek veri yok"

  @Bug @canNotDeleteUnitWithAppt @TC0073 @US_009
  Scenario: User can not delete the unit with an appointment
    When click settings button
    And click unit definitions button

    And click new add button
    And enter service code "132" to service code box
    And enter the daily capacity "1"
    And click save button
    Then assert the new surgery service unit "132"

    And enter service code "132" to unit code box
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the service can not be deleted "HATA"


  @Bug @toPassive @TC0074 @US_009
  Scenario: User can switch the passive the unit
    When click settings button
    And click unit definitions button
    And enter service code "9071" to unit code box
    And click edit button
    And click passive box
    And click save button
    And enter service code "9071" to unit code box
    Then assert the service was deleted "Görüntülenecek veri yok"

  @Bug @toActive @TC0075 @US_009
  Scenario: User can switch the active the unit
    When click settings button
    And click unit definitions button
    And enter service code "9071" to unit code box
    And click edit button
    And click active box
    And click save button
    Then assert the unit is active

  @Smoke @newGroup @TC0076 @US_010
  Scenario: User can create new group
    When click settings button
    And click group definitions button
    And click new add button
    And enter service code "1700" to branch code box
    And enter the group name "SALON 10"
    And click save button
    Then assert the new group "Dermatoloji"

  @Regression @newGroupNoInfo @TC0077 @US_010
  Scenario: User can create new group without no information
    When click settings button
    And click group definitions button
    And click new add button
    And enter service code "1700" to branch code box
    And click save button
    Then assert the new group "Dermatoloji"

  @Regression @noSameGroup @TC0078 @US_010
  Scenario: User can not create same group
    When click settings button
    And click group definitions button
    And click new add button
    And enter service code "1700" to branch code box
    And enter the group name "SALON 10"
    And click save button
    Then assert the new group "Dermatoloji"

  @Regression @editGroup @TC0079 @US_010
  Scenario: User can edit the group
    When click settings button
    And click group definitions button
    And enter group code "13" to group code box
    Then edit the group name
      | Salon 30 |
      | Icardi   |
      | 999999   |
      | 999999   |
      | ^+       |
      | ^+%&#    |

  @Smoke @createReason @TC0080 @US_011
  Scenario: User can create the reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling better now"

  @Bug @createSameReason @TC0081 @US_011
  Scenario: User can not create the same reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling better now"

  @Regression @editReason @TC0082 @US_011
  Scenario: User can edit the reason
    When click settings button
    And click cancellation reason button
    And enter "feeling better now" to reason of cancellation search box
    And click edit button
    And delete the reason of cancellation
    And enter "feeling perfect now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling perfect now"

  @Smoke @deleteReason @TC0083 @US_011
  Scenario: User can delete the reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And enter "feeling perfect now" to reason of cancellation search box
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the reason was deleted