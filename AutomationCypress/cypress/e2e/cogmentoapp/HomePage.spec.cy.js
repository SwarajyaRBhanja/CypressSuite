
import data from './../../fixtures/data.json';
import LoginPageModel from '../../support/page_objects/LoginPageModel'
import ExecutionHelper from '../../support/ExecutionHelper'

describe ('HomePage Verification',()=>{

    const loginPage= new LoginPageModel();
    var homePage= null;
    //const help= new ExecutionHelper();

    it('verify homepage url',()=>{

        homePage= loginPage.loginCogmento();   
        cy.wait(10000)
        cy.xpath("//i[@class='home icon']").click()

        cy.url().should('be.equals', `${data.loginUrl}home`)
        console.log(cy.title())
    })
        it('verify title',()=>{

            cy.title().should('eq','Cogmento CRM')
    })
    it('check mouse hover',()=>{
        //ExecutionHelper.mouseHover(cy.xpath('//i[@class="calendar icon"]'))
        //ExecutionHelper.realMouseHover(cy.xpath('//i[@class="calendar icon"]'))

        cy.contains('Calendar').trigger('mouseover')
        cy.xpath('//*[@id="main-nav"]/div[2]/button/i').click()
        cy.wait(5000)
})


})