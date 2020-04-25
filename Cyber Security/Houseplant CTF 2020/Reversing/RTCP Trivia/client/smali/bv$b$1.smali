.class final Lbv$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbv$b;-><init>(Lbv;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbv;

.field final synthetic b:Lbv$b;


# direct methods
.method constructor <init>(Lbv$b;Lbv;)V
    .locals 0

    iput-object p1, p0, Lbv$b$1;->b:Lbv$b;

    iput-object p2, p0, Lbv$b$1;->a:Lbv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lbv$b$1;->b:Lbv$b;

    iget-object p1, p1, Lbv$b;->d:Lbv;

    invoke-virtual {p1, p3}, Lbv;->setSelection(I)V

    iget-object p1, p0, Lbv$b$1;->b:Lbv$b;

    iget-object p1, p1, Lbv$b;->d:Lbv;

    invoke-virtual {p1}, Lbv;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbv$b$1;->b:Lbv$b;

    iget-object p1, p1, Lbv$b;->d:Lbv;

    iget-object p4, p0, Lbv$b$1;->b:Lbv$b;

    iget-object p4, p4, Lbv$b;->b:Landroid/widget/ListAdapter;

    invoke-interface {p4, p3}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide p4

    invoke-virtual {p1, p2, p3, p4, p5}, Lbv;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object p1, p0, Lbv$b$1;->b:Lbv$b;

    invoke-virtual {p1}, Lbv$b;->c()V

    return-void
.end method
