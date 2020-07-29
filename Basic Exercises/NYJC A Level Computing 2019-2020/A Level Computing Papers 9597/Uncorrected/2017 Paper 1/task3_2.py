### Evidence 7 ##########################
    def FindNode(self,NodeValue): # Returns int
        Found = False
        CurrentPosition = self.Root
        while not(Found == True or CurrentPosition > 25):
            if self.RobotData[CurrentPosition].DataValue == NodeValue :
                Found = True
            else:
                CurrentPosition = CurrentPosition + 1
        if CurrentPosition > 25 :
            return 0
        else:
            return CurrentPosition

    def AddToRobotData(self,NewDataItem, ParentItem, ThisMove):
        if self.Root == 1 and self.NextFreeChild == 1 :
            self.NextFreeChild = self.RobotData[self.NextFreeChild].LeftChild
            self.RobotData[self.Root].LeftChild = 0
            self.RobotData[self.Root].DataValue = NewDataItem
        else:
            # does the parent exist?
            ParentPosition = self.FindNode(ParentItem)
            if ParentPosition > 0 :  # parent exists
                # does the child exist?
                ExistingChild = self.FindNode(NewDataItem)
                if ExistingChild > 0 : # child exists
                    ChildPointer = ExistingChild
                else:
                    ChildPointer = self.NextFreeChild
                    self.NextFreeChild = self.RobotData[self.NextFreeChild].LeftChild
                    self.RobotData[ChildPointer].LeftChild = 0
                    self.RobotData[ChildPointer].DataValue = NewDataItem
                if ThisMove == 'L' :
                    self.RobotData[ParentPosition].LeftChild = ChildPointer
                else:
                    self.RobotData[ParentPosition].RightChild = ChildPointer
    
