import groovy.json.JsonSlurper

def getPrBody() {
    
    if(manager.logContains("vinodkumar")) {
      manager.addWarningBadge("Thou shalt not use deprecated methods.")
      manager.createSummary("warning.gif").appendText("<h1>You have been warned!</h1>", false, false, false, "red")
      manager.buildUnstable()
    }
  
}

