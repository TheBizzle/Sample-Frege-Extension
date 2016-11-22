package org.nlogo.extensions.frege

import
  org.nlogo.{ agent, api, core, nvm },
    api.{ Argument, Context, DefaultClassManager, Reporter, PrimitiveManager },
    core.{ LogoList, Syntax },
      Syntax.{ ListType, NumberType, reporterSyntax }

class FregeExtension extends DefaultClassManager {
  def load(manager: PrimitiveManager) {
    manager.addPrimitive("sum-list", SumList)
  }
}

object SumList extends Reporter {
  override def getSyntax = reporterSyntax(right = List(ListType), ret = NumberType)
  override def report(args: Array[Argument], context: Context): AnyRef = {
    val list = args(0).getList
    Double.box(FregeExtensionImpl.sumListJava(list.toVector.toArray))
  }
}
