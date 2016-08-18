Readme to use the JIRA sample: 

About the sample: 

The sample application demonstrates the usage of JIRA connector. The users are assumed to have access to the JIRA server referred in the sample. 
Basic Authentication is enforced to ensure the users accessing the JIRA server have valid permissions to do so. 

Steps: 

- Import the JIRA Query application in BusinessStudio. 
- Provide the AD credentials in the Identity Provider shared resource under Resources folder of the application. 
- Modify the host and port of the JIRA server in the HTTP Client shared resource, if required. The sample points to the JIRA server used by TIBCO Engg and the users need to have access to this particular JIRA server. 
- JiraQuery activity has the JQL provided in the Input tab. Users can modify the JQL per the required usecase. 
- Run/Debug the application in BusinessStudio to test the application. 

Sample Input: 


Sample Output: 
