<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${title}</title>
    <script src="https://cdn.anychart.com/js/latest/anychart-bundle.min.js"></script>
    <link rel="stylesheet" href="https://cdn.anychart.com/css/latest/anychart-ui.min.css" />
    <asset:stylesheet src="chart.css"/>
</head>
<body>
<div id="container"></div>
<script>
    anychart.onDocumentReady(function() {
        var chart = anychart.pie(${raw(chartData)});
        chart.title("${chartTitle}");
        chart.container("container");
        chart.draw();
    });
</script>
</body>
</html>