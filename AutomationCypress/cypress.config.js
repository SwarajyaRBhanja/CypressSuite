const { defineConfig } = require("cypress");

module.exports = defineConfig({

  "chromeWebSecurity": false,
    "defaultCommandTimeout": 10000,
    "execTimeout": 60000,
    "pageLoadTimeout": 60000,
    "requestTimeout": 15000,
    "responseTimeout": 15000,

    "reporter": "mochawesome",
    "reporterOptions": {
      "reportDir": "cypress/reports",
      "reportFilename": "report",
      "overwrite": false,
      "html": true,
      "json": true,
      "charts": true
    },
    "video": true,
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
