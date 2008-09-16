/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eshark.xmlprog.exception;

/**
 * Project Name  :: XMLProgramming
 * File Name     :: XMLProgFormatException.java
 * Created on    :: Mar 14, 2008 3:21:06 PM
 * @author       :: Subhasish Chattopadhyay
 * Purpose       :: 
 *
 * ********************************************************************
 *                         File Change History                        *
 **********************************************************************
 *       Date        |                 Description                    |
 *---------------------------------------------------------------------
 *   Mar 14, 2008 |                  Created                       |
 *---------------------------------------------------------------------
 */
public class XMLProgFormatException extends XMLProgException
{

	/**
	 * This field named serialVersionUID of type long will 
	 * hold
	 */
	private static final long	serialVersionUID	= 5731611549535924665L;

	/**
	 * This creates XMLProgFormatException
	 */
	public XMLProgFormatException()
	{
		super();
	}

	/**
	 * This creates XMLProgFormatException
	 * @param aMessage
	 */
	public XMLProgFormatException(String aMessage)
	{
		super(aMessage);
	}

	/**
	 * This creates XMLProgFormatException
	 * @param aCause
	 */
	public XMLProgFormatException(Throwable aCause)
	{
		super(aCause);
	}

	/**
	 * This creates XMLProgFormatException
	 * @param aMessage
	 * @param aCause
	 */
	public XMLProgFormatException(String aMessage, Throwable aCause)
	{
		super(aMessage, aCause);
	}
}