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
    And close popup page

    And delete a unit "187"


  @Regression @newUnitNoInfo @TC0068 @US_009
  Scenario: User can not create new surgery service unit without information
    #When click settings button
    #And click unit definitions button
    #And click new add button
    #And click save button
    And create new unit "" ""
    Then assert the popup message "Servis kodu boş olamaz."
    And close the warning message
    And enter service code "168" to service code box
    And click save button
    Then assert the new surgery service unit "168"
    And close popup page
    And delete a unit "168"


  @Regression @noSameUnit @TC0069 @US_009
  Scenario: User can not create same surgery service unit
    And create new unit "110" "10"
    Then assert the new surgery service unit "110"
    #When click settings button
    #And click unit definitions button
    #And click new add button
    #And enter service code "187" to service code box
    #And enter the daily capacity "5"
    #And click save button
    And close popup page
    And create new unit "110" "12"
    Then assert the warning message "Aynı Kayıttan Daha Önce Girilmiş"

    And close the warning message
    And close unit popUp edit page
    And close popup page
    And delete a unit "110"


  @Bug @changeCapacity @TC0070 @US_009
  Scenario: User can change the daily surgery capacity of service unit
    #When click settings button
    #And click unit definitions button
    And create new unit "187" ""
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

    And click delete button
    And click yes button

  @Smoke @noApptMoreThanCapacity @TC0071 @TC0059 @US_009
  Scenario: User can not create more appointments than the capacity and delete the appointment

    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 132  | 20.09.2023 | 15388830 | 613180  | 09 : 00 |

    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 132  | 20.09.2023 | 14028483 | 612760  | 10 : 00 |

    Then assert the warning message "Kayıt yapılamaz! Günlük maximum kayıt sayısı :1"
    And close the warning message
    And close popup page
    And select the start date "20.09.2023"
    And select the end date "20.09.2023"
    And click on refresh button main
    And click on the refresh button
    And search the protocol number "15388830"
    And click patient settings button
    And click the delete appointment button
    And click yes button
    Then assert the service was deleted "Görüntülenecek veri yok"


  @Smoke @deleteUnit @TC0072 @US_009
  Scenario: User can delete the surgery service unit
    And create new unit "187" "5"
    And enter service code "187" to unit code box
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the service was deleted "Görüntülenecek veri yok"

  @Bug @canNotDeleteUnitWithAppt @TC0073 @US_009
  Scenario: User can not delete the unit with an appointment
    When create new unit "1028" "3"

   # When create a new appointment
   #  | code | date       | protocol | surgery | time    |
   #  | 1028 | 31.10.2023 | 15388830 | 615442  | 09 : 00 |

    And close popup page
    When click settings button
    And click unit definitions button

    And enter service code "1028" to unit code box
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
    And click delete button
    And click yes button


  @Regression @newGroupNoInfo @TC0077 @US_010
  Scenario: User can create new group without no information
    When click settings button
    And click group definitions button
    And click new add button
    And enter service code "1700" to branch code box
    And click save button
    Then assert the new group "Dermatoloji"
    And click delete button
    And click yes button


  @Regression @noSameGroup @TC0078 @US_010
  Scenario: User can not create same group
    When click settings button
    And click group definitions button
    And click new add button
    And enter service code "1700" to branch code box
    And enter the group name "SALON 10"
    And click save button
    Then assert the new group "Dermatoloji"
    And click new add button
    And enter service code "1700" to branch code box
    And enter the group name "SALON 10"
    And click save button
    Then assert the new group "Dermatoloji"
    And click delete button
    And click yes button
    And click delete button
    And click yes button


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
    And click delete button
    And click yes button

  @Bug @createSameReason @TC0081 @US_011
  Scenario: User can not create the same reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling better now"
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling better now"
    And click delete button
    And click yes button
    And click delete button
    And click yes button

  @Regression @editReason @TC0082 @US_011
  Scenario: User can edit the reason
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "feeling better now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling better now"
    #And enter "feeling better now" to reason of cancellation search box
    And click edit button
    And delete the reason of cancellation
    And enter "feeling perfect now" to reason of cancellation box
    And click save button
    Then assert the reason "feeling perfect now"
    And click delete button
    And click yes button

  @Smoke @deleteReason @TC0083 @US_011
  Scenario: User can delete the reason for surgery cancellation
    When click settings button
    And click cancellation reason button
    And click new add button
    And enter "abeyis reason" to reason of cancellation box
    And click save button
    Then assert the reason "abeyis reason"
    And click delete button
    Then assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the reason was deleted

  #When create a new appointment
    #  | code | date       | protocol | surgery | time    |
    #  | 1028 | 31.10.2023 | 15388830 | 615442  | 09 : 00 |





    ###EYUP

  @TC0057
  Scenario: TC0057 - User may postpone patient appointment
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 15388830 | 613180  | 09 : 00 |
    And search the protocol number "15388830"
    And assert the appointment title "Randevu Verildi"
    And click patient settings button
    And appointment postponement click
    And select the postpone date "29.09.2023"
    And choose the reason for procrastination
    And add a postpone description "abeyis automation"
    And click save button
    And select the start date "29.09.2023"
    And select the end date "29.09.2023"
    And click on the refresh button
    And assert the appointment title "Randevu Ertelendi"
    Then assert the appointment date "29.09.2023"
    And click patient settings button
    And click the delete appointment button
    And click yes button

  @TC0058
  Scenario: User can cancel patient appointment
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 15388830 | 613180  | 09 : 00 |

    And select the start date "20.09.2023"
    And select the end date "20.09.2023"
    And click on refresh button main
    #And click on the refresh button
    And search the protocol number "15388830"
    And click patient settings button

    And click on the cancel appointment button
    And select cancel reason "37"
    And add a cancel description "abeyis automation"
    And click save button
    And click check box cancel appointment
    And assert the appointment title "İptal Edildi"

    #And verify that your appointment has been canceled

   #And delete appointment
   #  | code | start date | end  date  | protocol |
   #  | 1028 | 31.10.2023 | 31.10.2023 | 15388830 |


  @TC0060
  Scenario:TC0060 - The appointment can be edited
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 14028483 | 613180  | 09 : 00 |
    And search the protocol number "14028483"
    And click patient settings button

    And click the fix appointment button
    #And check that you are on the pop up page
    And select the surgery decision date and time "11.09.2023 11:11:11"
    And change the appointment number "3"
    And select the date "20.10.2023"

    And select the second surgery "612280"
    #And select the illness ""
    And select the type of anesthesia "LOCAL"
    And select the side ""
    And change the service date "05.09.2023"
    And add edit phone numbers "05005005050" "05005005051"
    And select group "5"
    And select saloon "17"
    And enter room no "111"
    And change the doctor "777"
    And click hours button
    And select appointment time "11 : 00"
    And enter surgery duration minute "60"
    And enter description of appointment "abeyis automation"

    And click save button
    And refresh page
    #And search the protocol number "14028483"
    And click patient settings button
    And click the fix appointment button
    And assert the surgery decision date and time "11.09.2023 11:11:11"
    And assert the appointment number "3"
    And assert the appointment date "20.10.2023"

    And assert the second surgery "612280"
    And assert the illness "W19"
    And assert the type of anesthesia "LOCAL"
    And assert the side ""
    And assert the service date "05.09.2023"
    And assert phone numbers "05005005050" "05005005051"
    And assert group "5"
    And assert saloon "17"
    And assert room no "111"
    And assert the doctor "777"
    And assert appointment time "11 : 00"
    And assert surgery duration minute "60"
    And assert description of appointment "abeyis automation"

    And close popup page
    And click patient settings button
    And click the delete appointment button
    Then click yes button



  @TC0061
  Scenario: TC0061 - user can not create a same appointment
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 15388830 | 613180  | 09 : 00 |
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 15388830 | 613180  | 09 : 00 |
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 14028483 | 613180  | 09 : 00 |
    When create a new appointment
      | code | date       | protocol | surgery | time    |
      | 163  | 20.09.2023 | 14028483 | 613180  | 09 : 00 |





