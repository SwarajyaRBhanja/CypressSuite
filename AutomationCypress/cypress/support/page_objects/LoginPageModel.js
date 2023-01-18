
import data from './../../fixtures/data.json';

export default class LoginPageModel{

    locators= {
        emailInput:() => cy.xpath("//input[@name='email']"),
        passwordInput:() => cy.xpath("//input[@name='password']"),
        submitButton:() => cy.xpath("//div[@class='ui fluid large blue submit button']")
    }

    loginCogmento(){

        cy.visit(data.loginUrl);
        cy.wait(10000)
        this.locators.emailInput().type(data.email)
        this.locators.passwordInput().type(data.password)
        this.locators.submitButton().click()
    }
}