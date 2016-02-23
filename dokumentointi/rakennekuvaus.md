### Rakennekuvaus

Laskin luokka huolehtii laskimen ulkoasuun littyvistä seikoista, ja käyttää Laskunapinkuuntelija ja Muuntimenkuuntelija luokkia liittämällä niitä nappeihin.

Laskimeen on liitetty kaksi Actionlistener eli napinkuuntelija luokkaa. Laskunapinkuuntelija toimii tavallisten laskutoimitusnappien, eli esimerkiksi summa ja neliöjuuri nappien, kuuntelijana ja määrittelee mitä kukin nappi tekee. Kuuntelija käyttää Logiikka luokkaa, josta se saa eri laskutoimitusten metodit. Utility luokka LaskinUtil tarjoaa kuuntelijalle metodin, joka tarkistaa että käyttäjän antama merkkijonosyöte on double luku.

Kuuntelija ottaa laskutoimituksiin käytettävät luvut Laskimen tekstikentistä tulos ja syöte. Riippuen napista jota painetaan, kuuntelija muokkaa tekstikenttiä ja käyttää Logiikan metodeja tähän.

Muuntimenkuuntelija toimii lämpötilamuunnin nappien kuuntelijana ja määrittelee mitä mikäkin nappi tekee. Kuuntelija käyttää Lampotilamuunnin luokkaa, jossa ovat eri lämpötilojen muuntamiseen tarkoitetut metodit, esimerkiksi annetun luvun muuntaminen Celciuksesta Fahrenheitiin. Myös Muuntimenkuuntelija käyttää LaskinUtilin metodia, jolla tarkistetaan että käyttäjän syöte on double luku.

Muuntimenkuuntelija ottaa muunnettavan luvun Laskimen syöte tekstikentästä. Rippuen napista jota painetaan, kuuntelija muokkaa tekstikenttiä ja käyttää Lampotilamuuntimen metodeja tähän.
