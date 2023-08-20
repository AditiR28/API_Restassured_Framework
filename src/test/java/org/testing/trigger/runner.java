package org.testing.trigger;

import java.io.IOException;

import org.testing.testscripts.TC2_GetRequest;
import org.testing.testscripts.TC_1post;
import org.testing.testscripts.TC_3GetParticularID;

public class runner {
	
		public static void main(String args[] ) throws IOException {
			TC_1post tc1 = new TC_1post();
			tc1.testcase1();
			TC2_GetRequest tc2 = new TC2_GetRequest();
			tc2.testcase2();
			TC_3GetParticularID tc3 = new TC_3GetParticularID();
			tc3.testcase3();
			
		}
	}

