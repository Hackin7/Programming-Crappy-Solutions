.class public final Landroidx/appcompat/app/AlertController$a$1;
.super Landroid/widget/ArrayAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/AlertController$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter<",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/AlertController$RecycleListView;

.field final synthetic b:Landroidx/appcompat/app/AlertController$a;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController$a;Landroid/content/Context;I[Ljava/lang/CharSequence;Landroidx/appcompat/app/AlertController$RecycleListView;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$a$1;->b:Landroidx/appcompat/app/AlertController$a;

    iput-object p5, p0, Landroidx/appcompat/app/AlertController$a$1;->a:Landroidx/appcompat/app/AlertController$RecycleListView;

    const p1, 0x1020014

    invoke-direct {p0, p2, p3, p1, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iget-object p3, p0, Landroidx/appcompat/app/AlertController$a$1;->b:Landroidx/appcompat/app/AlertController$a;

    iget-object p3, p3, Landroidx/appcompat/app/AlertController$a;->F:[Z

    if-eqz p3, :cond_0

    iget-object p3, p0, Landroidx/appcompat/app/AlertController$a$1;->b:Landroidx/appcompat/app/AlertController$a;

    iget-object p3, p3, Landroidx/appcompat/app/AlertController$a;->F:[Z

    aget-boolean p3, p3, p1

    if-eqz p3, :cond_0

    iget-object p3, p0, Landroidx/appcompat/app/AlertController$a$1;->a:Landroidx/appcompat/app/AlertController$RecycleListView;

    const/4 v0, 0x1

    invoke-virtual {p3, p1, v0}, Landroidx/appcompat/app/AlertController$RecycleListView;->setItemChecked(IZ)V

    :cond_0
    return-object p2
.end method
