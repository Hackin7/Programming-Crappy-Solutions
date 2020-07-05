.class final Lia$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lic;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Lhp;

.field final synthetic e:Ljava/util/ArrayList;

.field final synthetic f:Ljava/util/ArrayList;

.field final synthetic g:Ljava/util/ArrayList;

.field final synthetic h:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lic;Landroid/view/View;Lhp;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lia$2;->a:Ljava/lang/Object;

    iput-object p2, p0, Lia$2;->b:Lic;

    iput-object p3, p0, Lia$2;->c:Landroid/view/View;

    iput-object p4, p0, Lia$2;->d:Lhp;

    iput-object p5, p0, Lia$2;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Lia$2;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Lia$2;->g:Ljava/util/ArrayList;

    iput-object p8, p0, Lia$2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lia$2;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lia$2;->b:Lic;

    iget-object v1, p0, Lia$2;->a:Ljava/lang/Object;

    iget-object v2, p0, Lia$2;->c:Landroid/view/View;

    invoke-virtual {v0, v1, v2}, Lic;->c(Ljava/lang/Object;Landroid/view/View;)V

    iget-object v0, p0, Lia$2;->b:Lic;

    iget-object v1, p0, Lia$2;->a:Ljava/lang/Object;

    iget-object v2, p0, Lia$2;->d:Lhp;

    iget-object v3, p0, Lia$2;->e:Ljava/util/ArrayList;

    iget-object v4, p0, Lia$2;->c:Landroid/view/View;

    invoke-static {v0, v1, v2, v3, v4}, Lia;->a(Lic;Ljava/lang/Object;Lhp;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lia$2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v0, p0, Lia$2;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lia$2;->h:Ljava/lang/Object;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lia$2;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lia$2;->b:Lic;

    iget-object v2, p0, Lia$2;->h:Ljava/lang/Object;

    iget-object v3, p0, Lia$2;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3, v0}, Lic;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object v0, p0, Lia$2;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lia$2;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Lia$2;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
