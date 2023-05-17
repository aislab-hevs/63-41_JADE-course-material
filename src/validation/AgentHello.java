package validateInstallation;

import jade.core.Agent;

public class AgentHello extends Agent {

    @Override
    protected void setup() {
        String text = "Congratulations! Jade is correctly installed in your project";

        println("From agent " + getLocalName() + " => " + text);
        println("Address of the agent => " + getAID());
        doDelete();
    }

    @Override
    protected void takeDown() {
        println("Agent" + getLocalName() + " is leaving the platform");
    }
}