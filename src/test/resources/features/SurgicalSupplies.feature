@SurgicalSupplies
@Regression

Feature: Surgical Supplies

  Background:
    Given The user logs in
    And The user goes Surgical Supplies page

  @Smoke @TC0084 @TC0085 @US_012 @Presentation
  Scenario: TC0084 TC0085 User can add delete the material and medicine to surgery from template
    When select the surgery date "11.09.2023"
    And click refresh button
    And click saloon
    And click refresh button
    And select patient

    And click apply template
    And click template name "AbeyisDeneme"
    And assert the popup message "Listede onaylanacak malzeme bulunmamaktadır."
    And close the warning message

    And click medicine process and update button
    And assert the popup message "Listede onaylanacak ilaç bulunmamaktadır."
    And close the warning message


  @Bug @TC0086 @US_012
  Scenario: TC0086 User can select and add the materials from stock list
    When select the surgery date "11.09.2023"
    And click refresh button
    And click saloon
    And click refresh button
    And select patient

    And enter barcode to barcode box "123"
    And assert the popup message "Malzeme giriniz veya seçiniz!"
    And close the warning message

    And double click barcode box
    And assert popup page "Seçilen kayıt sayısı"
    And enter barcode to material code box "123"
    And assert the material or medicine "123" "MalzemeListe"
    And close popup page

    And click materials popup page button
    And assert popup page "Seçilen kayıt sayısı"
    And close popup page

    And enter medicine code to add medicine box "123"
    And double click medicine code box
    And assert popup page "Seçilen kayıt sayısı"
    And enter medicine code to medicine code box "123"
    And assert the material or medicine "123" "IlacListe"
    And close popup page

    And click medicine popup page button
    And assert popup page "Seçilen kayıt sayısı"
    And close popup page

    And click materials add button
    And assert the popup message "Malzeme giriniz veya seçiniz!"
    And close the warning message

    And click medicine add button
    And assert the popup message "İlaç giriniz veya seçiniz!"
    And close the warning message

  @Bug @TC0087 @US_012
  Scenario: TC0087 User can create, edit and delete the template materials
    And delete template if template is "Test Abeyis"
    And close popup page
    And delete template if template is "Abeyis Automation Test"
    And close popup page
    And delete template if template is "Abeyis Test"
    And close popup page

    When click template definitions button
    And assert popup page "Ameliyat Malzeme Şablon Tanımları"

    And click new template add button
    And select type of template "Cerrahi"
    And enter template name "Test Abeyis"
    And enter branch code to branch box "3"
    And double click examination name box
    And enter code to official code box "G100040"
    And click save button
    Then assert new template by name "Test Abeyis"

    And click new template add button
    And select type of template "Cerrahi"
    And enter template name "Test Abeyis"
    And enter branch code to branch box "3"
    And double click examination name box
    And enter code to official code box "G100040"
    And click save button
    Then assert new template by name "Test Abeyis"
    And click new template add button
    And select type of template "Anestezi"
    And enter template name "Abeyis Test"
    And enter branch code to branch box "8"
    And double click examination name box
    And enter code to official code box "S100021"
    And click save button
    Then assert new template by name "Abeyis Test"

    And enter template name to name search box "Abeyis Test"
    When click edit button
    And select type of template "Cerrahi"
    And clear template name
    And enter template name "Abeyis Automation Test"
    And enter branch code to branch box "14"
    And double click examination name box
    And enter code to official code box "SP990060"
    And click save button
    And enter template name to name search box "Abeyis Automation Test"
    Then assert new template by name "Abeyis Automation Test"
    And close popup page

    And delete template if template is "Test Abeyis"
    And close popup page
    And delete template if template is "Abeyis Automation Test"
    And close popup page
    And delete template if template is "Abeyis Test"
    And close popup page