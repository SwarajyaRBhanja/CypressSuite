

export default class HomePageModel {

    locators= {

        contactsButton: () => cy.xpath("//i[@class='users icon']")
    }

    getHomePageTitle(){

        return cy.title()
    }

    clickContacts(){

        this.locators.contactsButton().click();
        return new ContactsPage;
    }
}