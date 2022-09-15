# Utility for testing "java heap space" error on app servers like WildFly, WebSphere etc.

## Steps
1) Build app as .war and put the file into deployment directory

2) Start the server

3) If your server doesn't support auto-deploy go to "deployments" and enable app.

4) Open browser and set URL as "http://localhost:8080/web_memory_eater/"

5) Click "START TO EAT MEMORY"

6) Look in the server's terminal. Values inside [] - are how much memory used the app. 
Default interval is 1Mb for every 100ms.  

7) Press "Ctrl+C" inside the terminal to stop app.