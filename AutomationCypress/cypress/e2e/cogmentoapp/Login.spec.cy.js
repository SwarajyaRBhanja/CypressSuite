import data from './../../fixtures/data.json';
import LoginPageModel from '../../support/page_objects/LoginPageModel'

describe('Cogmento App', ()=>{

    const page= new LoginPageModel();
    it('Login Test', ()=>{

        page.loginCogmento();
    })
})
