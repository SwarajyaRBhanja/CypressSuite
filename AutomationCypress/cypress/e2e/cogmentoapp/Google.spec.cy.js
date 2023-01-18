describe('Google App', ()=>{

    it.only('Title Test', ()=>{

        cy.visit('https://www.google.co.in/');
        cy.title().should('eq','Google')

    })
    it.only('Background Test', ()=>{

        cy.visit('https://www.google.co.in/');
        cy.get("input[aria-label='Google Search']").should('have.css','background-color').and('eq','rgb(48, 49, 52)')

    })

})