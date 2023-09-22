package matrixalgebra;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import matrixalgebra.tests.AddTestSuite;
import matrixalgebra.tests.MultiplyTestSuite;
import matrixalgebra.tests.TransposeTestSuite;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AddTestSuite.class, TransposeTestSuite.class, MultiplyTestSuite.class })
public class MatrixAlgebraTestSuite {
}
