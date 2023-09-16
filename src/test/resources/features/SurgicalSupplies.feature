@SurgicalSupplies
@Regression
Feature: Surgery Appointment

  Background:
    Given The user logs in
    And The user goes Surgical Supplies page

  @Smoke @TC0084 @TC0085 @US_012
  Scenario: TC0084 TC0085 User can add delete the material and medicine to surgery from template
    When select the surgery date "11.09.2023"
    And click refresh button
    And click saloon
    And click refresh button
    And select patient

    And if material displayed delete the material "2168"
    And if material displayed delete the material "3901"
    And if medicine displayed delete the medicine "27233"
    And if medicine displayed delete the medicine "33568"


    And click apply template
    And click template name "Deneme"

    And click approve box for materials
    And click materials process and update button
    And assert the popup message "Hastaya Onaylanmış Olan Malzemeler İşlenecek"
    And click yes button
    And assert the popup message "Malzeme işlenemedi"
    And click okey button

    And click approve box for medicine
    And click medicine process and update button
    And assert the popup message "Hastaya Onaylanmış Olan İlaçlar İşlenecek"
    And click yes button
    And assert the popup message "İlaç işlenemedi"
    And click okey button

    And delete the material "2168"
    And assert the popup message "Silmek İstediğinize Emin misiniz?"
    And click yes button
    And assert the material or medicine deleted "2168"

    And delete the material "3901"
    And assert the popup message "Silmek İstediğinize Emin misiniz?"
    And click yes button
    And assert the material or medicine deleted "3901"

    And delete the medicine "27233"
    And assert the popup message "Silmek İstediğinize Emin misiniz?"
    And click yes button
    And assert the material or medicine deleted "27233"

    And delete the medicine "33568"
    And assert the popup message "Silmek İstediğinize Emin misiniz?"
    And click yes button
    And assert the material or medicine deleted "33568"


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
    #And assert the popup message "Malzeme giriniz veya seçiniz!"
    #And close the warning message

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
    When click template definitions button
    And assert popup page "Ameliyat Malzeme Şablon Tanımları"
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
    When click delete button
    And assert the popup message "Bu kaydı silmek istediğinize emin misiniz?"
    And click yes button
    Then assert the template deleted "Abeyis Automation Test"
