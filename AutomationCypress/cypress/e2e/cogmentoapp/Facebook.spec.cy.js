

describe('Facebook App', ()=>{

    it.only('Title Test', ()=>{

        cy.visit('https://www.facebook.com/');
        cy.title().should('eq','Facebook – log in or sign up')

    })
    it.only('Background Test', ()=>{

        cy.visit('https://www.facebook.com/');
        cy.get("button[data-testid='royal_login_button']").should('have.css','background-color').and('eq','rgb(48, 49, 52)')

    })

})
