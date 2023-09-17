@CreateSurgeryList
@Regression
Feature: Create Surgery List

  Background:
    Given The user logs in
    And The user goes Surgery Appointment page

  @TC0001 @Smoke @US_001
  Scenario: TC0001 The User should be able to create surgery list
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "17.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "13:30" as a surgery time on Surgery List Page
    And The user adds a  surgery on Surgery List Page
    And The user adds a surgery team on Surgery List Page
    And The user selects a surgical team leader on Surgery List Page
    And The user adds an anesthesia team on Surgery List Page
    And The user selects an anesthesia team leader on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then Surgery List should be created on Surgery List Page
    And Rollback all steps taken on Surgery List Page


  @TC0002  @US_001
  Scenario: TC0002 The user can cancel the surgery for which he/she has approved the surgery.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "18.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "13:30" as a surgery time on Surgery List Page
    And The user adds a  surgery on Surgery List Page
    And The user adds a surgery team on Surgery List Page
    And The user selects a surgical team leader on Surgery List Page
    And The user adds an anesthesia team on Surgery List Page
    And The user selects an anesthesia team leader on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    And The user can cancel  the approved surgery on Surgery List Page.
    Then The user verifies that the approved surgery is canceled on Surgery List Page.
    And Rollback all steps taken on Surgery List Page

  @TC0003 @Smoke  @US_001
  Scenario Outline: TC0003 The user cannot create a surgery list for a past date.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects a past appointment date "<Request Date>" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "13:30" as a surgery time on Surgery List Page
    And The user adds a  surgery on Surgery List Page
    And The user adds a surgery team on Surgery List Page
    And The user selects a surgical team leader on Surgery List Page
    And The user adds an anesthesia team on Surgery List Page
    And The user selects an anesthesia team leader on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then A pop up alert should appear for the past date on Surgery List Page
    Examples:
      | Request Date |
      | 01.04.2008   |
      | 13.08.2000   |

  @TC0004 @Bug  @US_001
  Scenario: TC0004 The option to postpone the surgery should not be displayed in the transactions section, when the user postpones the surgery.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "19.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user adds a  surgery on Surgery List Page
    And The user adds a surgery team on Surgery List Page
    And The user selects a surgical team leader on Surgery List Page
    And The user adds an anesthesia team on Surgery List Page
    And The user selects an anesthesia team leader on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    And The user can cancel  the approved surgery on Surgery List Page.
    Then The option to postpone the surgery should not be displayed in the transactions section

  @TC0005 @Bug @Smoke  @US_001
  Scenario Outline: TC0005 When a past date is selected for the request date,the user should not be able to enter any data on the page.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects a past appointment date "<Request Date>" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds a hall on Surgery List Page
    And The user selects a patient on Surgery List Page
    Then The user cannot add a patient to a hall on Surgery List Page

    Examples:
      | Request Date |
      | 01.04.2004   |
      | 13.08.2003   |


  @TC0006 @Bug  @US_001
  Scenario: TC0006 The user cannot add a patient to more than one hall at the same time on Surgery List Page
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "12.12.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "13:30" as a surgery time on Surgery List Page
    And The user adds  "Salon_7" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "13:30" as a surgery time on Surgery List Page
    Then More than one hall should not be seen on Surgery List Page

  @TC0007 @Bug  @US_001
  Scenario: TC0007 More than one patient should not be added to the same hall at the same time.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "13.12.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_7" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "10:30" as a surgery time on Surgery List Page
    And The user selects a patient "MAYFS BAFDJ" on Surgery List Page
    And The user adds the patient "MAYFS BAFDJ" to  the hall on Surgery List Page
    And The user enters  "10:30" as a surgery time on Surgery List Page
    Then Only one patient should be added to a hall on Surgery List Page.

  @TC0008 @Bug  @US_001
  Scenario: TC0008 Surgery list should not be created on public holidays.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date on a Public Holiday day  "01.01.2024" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then Surgery List should not be created on Surgery List Page

  @TC0009 @Bug @Smoke  @US_001
  Scenario: TC0009 A patient cannot have more than one operation on the same day and time.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "14:30" as a surgery time on Surgery List Page
    And The user adds  "Salon_3" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "14:30" as a surgery time on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then Surgery List should not be created because of more than one operation on Surgery List Page


  @TC0010  @US_001
  Scenario:  TC0010 A hall that can be added for the surgery list should  be changed with any  hall from Hall List.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "26.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user adds  "Salon_7" hall on Surgery List Page
    And The user change "Salonu Değiştir"  the hall "Salon_2" with the hall "Salon_7" on Surgery List Page
    Then The user verifies "Salon_2" is empty and  "Salon_7" has a patient on Surgery List Page

  @TC0011  @US_001
  Scenario: TC0011 A hall added for the surgery list should be able to be canceled
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "03.11.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    Then The user can cancel the hall on Surgery List Page


  @TC0012  @US_001
  Scenario: TC0012 Any service from service list should be selected on  Surgery List Page
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "03.11.2023" on Surgery List Page
    Then Any service should be selected on  Surgery List Page




  @Smoke @TC0020 @US_002
  Scenario: TC0020  Add surgery
    When User clicks on Patient transactions
    And The user clicks on Operation
    And  User clicks to create an operation list
    And User Selects Date from Appointment Patients section
    And The User clicks the refresh button
    And User Selects Service
    And User adds new hall
    And User double clicks on Patient
    And The user adds a surgery team on Surgery List Page
    And The user selects a surgical team leader on Surgery List Page
    And The user adds an anesthesia team on Surgery List Page
    And  The user selects an anesthesia team leader on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then Surgery List should be created on Surgery List Page
    And Rollback all steps taken on Surgery List Page


  @:TC0022 @US_002
  Scenario:TC0022  Removing a Patient from the Table in the Operations Tab
    When User clicks on Patient transactions
    And The user clicks on Operation
    And  User clicks to create an operation list
    And User Selects Date from Appointment Patients section
    And The User clicks the refresh button
    And User Selects Service
    And User adds new hall
    And User double clicks on Patient
    And User clicks operations button
    And User clicks islemler masadan cikar
    And User clicks uyari popup evet butonuna
    And thr user clicks masadan cikar  ekle button tab
    And the user clicks devam edilsinmi popup
    And User verifies ameliyat edilecek hasta listesi


  @TC0023  @US_002
  Scenario:TC0023  Hall cancellation procedures
    When User clicks on Patient transactions
    And The user clicks on Operation
    And  User clicks to create an operation list
    And User Selects Date from Appointment Patients section
    And The User clicks the refresh button
    And User Selects Service
    And User adds new hall
    And The user clicks on Operating Room Procedures   Page
    And User clicks on the Cancel Hall button
    And User Hall gives consent to the popup whether to be cancelled
    And User confirms hall cancellation


  @TC0024  @US_002
  Scenario: TC0024  Hall Change
    When User clicks on Patient transactions
    And The user clicks on Operation
    And  User clicks to create an operation list
    And User Selects Date from Appointment Patients section
    And The User clicks the refresh button
    And User Selects Service
    And User adds new hall
    And User double clicks on Patient
    And User clicks on Hall operations
    #And  User clicks Add "Salon_3" lounge
    And The user adds  "Salon_3" hall on Surgery List Page
    And The user change "Salonu Değiştir"  the hall "Salon_2" with the hall "Salon_3" on Surgery List Page
    Then The user verifies "Salon_2" is empty, "Salon_3" has a patient and rollback all steps on Surgery List Page










































