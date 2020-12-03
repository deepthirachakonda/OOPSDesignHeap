import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestForInsertions.class, TestforExternalIterator.class, Testforheight.class,
		TestForInternalIterator.class, TestForMaximumHeapInsertions.class, TestForOddFilter.class,
		TestForOddHeapDecorator.class, TestForNode.class })
public class RunTestSuiteMinHeap {
}
