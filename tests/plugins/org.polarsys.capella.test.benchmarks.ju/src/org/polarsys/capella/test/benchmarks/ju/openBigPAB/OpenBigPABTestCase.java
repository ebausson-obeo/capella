/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.benchmarks.ju.openBigPAB;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.common.lib.Memory;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.test.benchmarks.ju.testcases.AbstractBenchmarkTestCase;
import org.polarsys.capella.test.diagram.common.ju.context.XABDiagram;
import org.polarsys.capella.test.framework.context.SessionContext;

/**
 * 
 * Open a big PAB
 */
public class OpenBigPABTestCase extends AbstractBenchmarkTestCase {

  public OpenBigPABTestCase() {
    // Do nothing
  }

  public String getBigPABName() {
    return "[PAB] Implementation and Behaviour Components";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void test() {
    long usedMemoryBefore = Memory.getUsedMemory();

    Session session = getSession(getRequiredTestModels().get(0));
    SessionContext context = new SessionContext(session);
    XABDiagram.openDiagram(context, getBigPABName(), Type.PA);
    long usedMemoryAfter = Memory.getUsedMemory();
    System.out.println(
        "Used memory: " + usedMemoryBefore / (1024 * 1024) + "MB / " + usedMemoryAfter / (1024 * 1024) + "MB.");
  }

}