/*
 * Copyright (c) 2012-2013, ScalaFX Ensemble Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package scalafx.ensemble.example.charts

import scalafx.ensemble.commons.EnsembleExample
import scalafx.geometry.Insets
import scalafx.scene.chart.PieChart
import scalafx.scene.control.Label
import scalafx.scene.layout.{Priority, VBox}
import scalafx.scene.text.Font

/** An advanced pie chart.
  *
  * @see scalafx.scene.chart.PieChart
  * @see scalafx.scene.chart.Chart
  */
class EnsembleAdvancedPieChart extends EnsembleExample {

  def getContent = new VBox {
    vgrow = Priority.ALWAYS
    hgrow = Priority.ALWAYS
    spacing = 10
    margin = Insets(50, 0, 0, 50)
    content = List(
      new Label {
        text = "Ensemble Advanced Pie Chart"
        font = new Font("Verdana", 20)
      },
      createPieChart())
  }

  def createPieChart() = {
    val data1 = PieChart.Data("Sun", 20)
    val data2 = PieChart.Data("IBM", 12)
    val data3 = PieChart.Data("HP", 25)
    val data4 = PieChart.Data("Dell", 22)
    val data5 = PieChart.Data("Apple", 30)

    new PieChart {
      data = Seq(data1, data2, data3, data4, data5)
      id = "Advanced Pie Chart"
      title = "Pie Chart Sample"
    }
  }
}