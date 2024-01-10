# Selenium Testng empty template

Empty template for Test Automation project with Selenide

# Instruction:

1. Download template and unpack in appropriate folder

2. Open project in IDE (for example IntelliJIdea)

3. Reporting: Allure is enabled, after running tests just run **allure:serve** in maven plugins (allure should be
   installed locally)

4. Parameters that can be changed placed in src/test/java/test/BaseTest.java

- baseUrl - base url of your site under tests
- browser - chrome/edge/firefox etc.
- pageLoadTimeout - timeout to wait page load
- headless - to run tests in headless mode, so if you want to hide browser set true

5. TestNg Retry and before after listeners: You can also modify rules of retry tests (now it is 1 retry for each test)
   and actions before/after all tests (now it prints test name and result) in **testng** folder

6. pages generated by JDN should be places in src/main/java/pages package
