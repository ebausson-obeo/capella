/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales Global Services - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.semantic.queries.ju.testcases;

import org.polarsys.capella.test.semantic.queries.ju.model.SemanticQueries;

import junit.framework.Test;

public class BinaryExpressionRightOperand extends SemanticQueries {
  String QUERY = "org.polarsys.capella.core.semantic.queries.BinaryExpression_rightOperand";

  @Override
  protected String getQueryCategoryIdentifier() {
    return QUERY;
  }

  @Override
  public void test() throws Exception {
    testQuery(SA_BINARYEXPRESSION_1, SA_RIGHTOPERAND_UNARYEXPRESSION_2);
  }

  public static Test suite() {
    return new BinaryExpressionRightOperand();
  }
}
