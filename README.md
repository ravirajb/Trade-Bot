# Trading Bot - That aims to connect with various brokers and algorthmically place orders

## Capabilities
[Y] Integrate with one Broker - Upstox   
[Y] Listen to the feed and do paper trades   
[Y] Print the paper trade results & buy / sell   
[Y] Springify the service for easier devX   
[X] Build for various Brokers - Zerodha, Alpaca, Crypto etc   
[X] Externalise the strategies and make them plug and play   
[X] Add ML capabilities with DeepLearning4J and OpenAI   
[X] Containerise and make it cloud agnostic - Deploy anywhere   
[X] Add a sink and save the details to the DB   
[X] Enough documentation for users to use this   

## Steps to run

1. Given it's linked to UpStox, the code assumes the developer has Upstox account
2. Generate the Access Token (before running and it expires daily) and update in the application.properties
3. Run the spring application and it executes for a predefined scrips
4. If one wants to change the scrips - update the WebSocketConnection with the scrips for now

