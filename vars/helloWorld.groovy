import hudson.model.*

def call() {
    def build = Thread.currentThread().executable
    def perfResult = "http://perf-carrier.reportportal.io:3000/d/8rk5UIk4z/gatling-performance-maven-new?orgId=1&var-grouping=30s&var-env=Alpha&var-test_type=baseline&var-simulation=createlaunchwithnestedsteps&var-low_limit=250&var-high_limit=700&var-percentile=95&from=%s&to=%s&refresh=5s"
    def start = build.getStartTimeInMillis();
    def end = start + build.getExecutor().getElapsedTime();
    perfResult = String.format(perfResult, start, end);
    def link = "<a href='%s'>%s</a><br/>";
    def sb = new StringBuilder();
    sb.append(String.format(link, perfResult, "Grafana Performance Result"));
    build.setDescription(sb.toString());
}