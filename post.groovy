#!/usr/bin/env groovy

errpattern = ~/failed to remove.*/;
manager.build.logFile.eachLine{ line -> errmatcher=errpattern.matcher(line)
    if (errmatcher.find()) {
        manager.build.@result = hudson.model.Result.UNSTABLE
    }
 }
