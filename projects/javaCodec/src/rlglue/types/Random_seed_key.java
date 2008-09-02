/* 
* Copyright (C) 2007, Brian Tanner
* 
http://rl-glue.googlecode.com/

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package rlglue.types;

public class Random_seed_key extends RL_abstract_type
{

	public Random_seed_key() 
	{
		this(0,0);
	}

	public Random_seed_key(int numInts, int numDoubles)
	{
		super(numInts,numDoubles);
	}
        
	public Random_seed_key(Random_seed_key src)
	{
		super(src);
	}
        

        public Random_seed_key duplicate(){
            return new Random_seed_key(this);
        }

}
