package Lockers_Pvt_Ltd;

import java.io.File;
import java.io.FilenameFilter;

class MyFilenameFilter implements FilenameFilter {
    
    String initials;
    
    // constructor to initialize object
    public MyFilenameFilter(String initials)
    {
        this.initials = initials;
    }
    
    // overriding the accept method of FilenameFilter
    // interface
    public boolean accept(File dir, String name)
    {
        return name.startsWith(initials);
    }

 

        
    }
