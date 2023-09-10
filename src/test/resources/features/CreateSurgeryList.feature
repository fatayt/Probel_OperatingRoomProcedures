@CreateSurgeryList

Feature: Create Surgery List

  Background:
    Given The user logs in

  @TC0001 @Smoke
  Scenario: The User should be able to create surgery list
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
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


  @TC0002
  Scenario: The user can cancel the surgery for which he/she has approved the surgery.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
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

  @TC0003 @Smoke
  Scenario Outline: The user cannot create a surgery list for a past date.
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

  @TC0004 @Bug
  Scenario: The option to postpone the surgery should not be displayed in the transactions section, when the user postpones the surgery.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
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

  @TC0005 @Bug @Smoke
  Scenario Outline: When a past date is selected for the request date,the user should not be able to enter any data on the page.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects a past appointment date "<Request Date>" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user selects a patient on Surgery List Page
    And The user adds a hall on Surgery List Page
    Then The user cannot add a patient to a hall on Surgery List Page

    Examples:
      | Request Date |
      | 01.04.2004   |
      | 13.08.2003   |


  @TC0006 @Bug
  Scenario:The user cannot add a patient to more than one hall at the same time on Surgery List Page
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
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

  @TC0007 @Bug
  Scenario: More than one patient should not be added to the same hall at the same time.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_7" hall on Surgery List Page
    And The user selects a patient "HAZSXG COHHOP" on Surgery List Page
    And The user adds the patient "HAZSXG COHHOP" to  the hall on Surgery List Page
    And The user enters  "10:30" as a surgery time on Surgery List Page
    And The user selects a patient "MAYFS BAFDJ" on Surgery List Page
    And The user adds the patient "MAYFS BAFDJ" to  the hall on Surgery List Page
    And The user enters  "10:30" as a surgery time on Surgery List Page
    Then Only one patient should be added to a hall on Surgery List Page.

  @TC0008 @Bug
  Scenario: Surgery list should not be created on public holidays.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date on a Public Holiday day  "01.01.2025" on Surgery List Page
    And The user selects a service "DAHİLİYE SERVİS" on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient on Surgery List Page
    And The user adds the patient to  the hall on Surgery List Page
    And The user sends the operating room Report on Surgery List Page
    Then Surgery List should not be created on Surgery List Page

  @TC0009 @Bug @Smoke
  Scenario:A patient cannot have more than one operation on the same day and time.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "26.10.2023" on Surgery List Page
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
    Then Surgery List should not be created on Surgery List Page


  @TC0010
  Scenario: A hall that can be added for the surgery list should  be changed with any  hall from Hall List.
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
    And The user selects a service on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    And The user selects a patient on Surgery List Page
    And The user adds the patient to  the hall on Surgery List Page
    And The user adds  "Salon_7" hall on Surgery List Page
    And The user change "Salonu Değiştir"  the hall "Salon_2" with the hall "Salon_7" on Surgery List Page
    Then The user verifies "Salon_2" is empty and  "Salon_7" has a patient on Surgery List Page

  @TC0011
  Scenario: A hall added for the surgery list should be able to be canceled
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
    And The user selects a service on Surgery List Page
    And The user adds  "Salon_2" hall on Surgery List Page
    Then The user can cancel the hall on Surgery List Page


  @TC0012
  Scenario: Any service from service list should be selected on  Surgery List Page
    Given The user clicks on Operating Room Operations   Page
    And The user clicks on Creating a Surgery List Page
    And The user selects an appointment date "25.10.2023" on Surgery List Page
    Then Any service should be selected on  Surgery List Page











































