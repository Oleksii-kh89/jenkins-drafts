import hudson.model.*

// get current thread / Executor
def thr = Thread.currentThread()
// get current build
def build = thr?.executable


// get parameters
def perfResult = "http://10.11.12.13:3000/dashboard/db/run-time-aggregate?from=%s&to=%s"
def jmxMonitor = "http://10.11.12.13:3000/dashboard/db/jmx-monitor?from=%s&to=%s"

// get build start and end time
def start = build.getStartTimeInMillis();
def end = start + build.getExecutor().getElapsedTime();

// replace time
perfResult = String.format(perfResult, start, end);
jmxMonitor = String.format(jmxMonitor, start, end);

//build the string to be added as description.
def link = "<a href='%s'>%s</a><br/>";
def sb = new StringBuilder();
sb.append(String.format(link, perfResult, "Grafana Performance Result"))
  .append(String.format(link, jmxMonitor, "Grafana JMX Result"));

// set build description
build.setDescription(sb.toString());