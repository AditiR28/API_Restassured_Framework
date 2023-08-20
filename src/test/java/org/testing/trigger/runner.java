

package org.testing.trigger;

import java.io.IOException;

import org.testing.testscripts.TC2_GetRequest;
import org.testing.testscripts.TC_1post;
import org.testing.testscripts.TC_3GetParticularID;
import org.testing.testscripts.TC_4Putrequest;
import org.testing.teststeps.TC_5Deleterequest;

public class runner {
	
		public static void main(String args[] ) throws IOException {
			TC_1post tc1 = new TC_1post();
			tc1.testcase1();
			TC2_GetRequest tc2 = new TC2_GetRequest();
			tc2.testcase2();
			TC_3GetParticularID tc3 = new TC_3GetParticularID();
			tc3.testcase3();
			TC_4Putrequest tc4 = new TC_4Putrequest();
			tc4.testcase4();
			TC_5Deleterequest tc5 = new TC_5Deleterequest();
			tc5.testcase5();
			
		}
	}

