package org.w3.banana
package n3js
package model

final class MGraph[S, P, O](var graph: plantain.model.Graph[S, P, O])

final case class BNode(label: String)
